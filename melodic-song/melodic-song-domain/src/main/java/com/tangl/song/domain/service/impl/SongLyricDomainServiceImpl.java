package com.tangl.song.domain.service.impl;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.enums.IsDeletedFlagEnum;
import com.tangl.song.domain.converter.SongLyricBOConverter;
import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.domain.service.SongLyricDomainService;
import com.tangl.song.infra.basic.entity.SongLyric;
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

    @Override
    public void add(SongLyricBO lyricBO) {
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
        lyricBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        SongLyric lyric = lyricBOConverter.lyricBO2Lyric(lyricBO);
        lyricService.updateById(lyric);
    }

    @Override
    public PageResult<List<SongLyricBO>> query(SongLyricBO lyricBO) {
        return null;
    }

}
