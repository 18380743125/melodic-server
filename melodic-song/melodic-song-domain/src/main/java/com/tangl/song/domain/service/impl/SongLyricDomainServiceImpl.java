package com.tangl.song.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.enums.IsDeletedFlagEnum;
import com.tangl.song.common.exception.MelodicBusinessException;
import com.tangl.song.domain.converter.SongLyricBOConverter;
import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.domain.service.SongLyricDomainService;
import com.tangl.song.infra.basic.entity.SongInfo;
import com.tangl.song.infra.basic.entity.SongLyric;
import com.tangl.song.infra.basic.service.SongInfoService;
import com.tangl.song.infra.basic.service.SongLyricService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongLyricDomainServiceImpl implements SongLyricDomainService {

    @Resource
    private SongLyricService lyricService;

    @Resource
    private SongLyricBOConverter lyricBOConverter;

    @Resource
    private SongInfoService infoService;

    @Override
    public void add(SongLyricBO lyricBO) {
        SongInfo info = infoService.getById(lyricBO.getSongId());
        if (info == null) {
            throw new MelodicBusinessException("歌曲不存在");
        }

        lyricBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        SongLyric lyric = lyricBOConverter.lyricBO2Lyric(lyricBO);
        lyricService.save(lyric);
    }

    @Override
    public void update(SongLyricBO lyricBO) {
        SongLyric lyric = lyricBOConverter.lyricBO2Lyric(lyricBO);
        lyricService.updateById(lyric);
    }

    @Override
    public void delete(SongLyricBO lyricBO) {
        lyricBO.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        SongLyric lyric = lyricBOConverter.lyricBO2Lyric(lyricBO);
        lyricService.updateById(lyric);
    }

    @Override
    public PageResult<SongLyricBO> query(SongLyricBO lyricBO) {
        PageResult<SongLyricBO> pageResult = new PageResult<>();
        Integer pageNo = lyricBO.getPageNo();
        Integer pageSize = lyricBO.getPageSize();
        Integer offset = (pageNo - 1) * pageSize;

        SongLyric lyric = lyricBOConverter.lyricBO2Lyric(lyricBO);
        QueryWrapper<SongLyric> query = Wrappers.query(lyric);

        int count = (int) lyricService.count(query);
        List<SongLyric> lyricList = lyricService.queryPage(lyric, offset, pageSize);

        List<SongLyricBO> lyricBOList = lyricBOConverter.lyricList2LyricBOList(lyricList);

        pageResult.setRecords(lyricBOList);
        pageResult.setTotal(count);

        return pageResult;
    }

}
