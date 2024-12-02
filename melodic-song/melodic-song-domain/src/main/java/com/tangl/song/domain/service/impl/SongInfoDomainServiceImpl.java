package com.tangl.song.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.enums.IsDeletedFlagEnum;
import com.tangl.song.common.enums.StatusEnum;
import com.tangl.song.domain.converter.SongInfoBOConverter;
import com.tangl.song.domain.entity.SongInfoBO;
import com.tangl.song.domain.service.SongInfoDomainService;
import com.tangl.song.infra.basic.entity.SongInfo;
import com.tangl.song.infra.basic.service.SongInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SongInfoDomainServiceImpl implements SongInfoDomainService {

    @Resource
    private SongInfoService infoService;

    @Resource
    private SongInfoBOConverter infoBOConverter;

    @Override
    public void add(SongInfoBO infoBO) {
        infoBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        infoBO.setStatus(StatusEnum.ENABLE.getCode());
        infoBO.setReleaseDate(new Date());

        SongInfo info = infoBOConverter.infoBO2Info(infoBO);

        infoService.save(info);
    }

    @Override
    public void update(SongInfoBO infoBO) {
        SongInfo info = infoBOConverter.infoBO2Info(infoBO);
        infoService.updateById(info);
    }

    @Override
    public void delete(SongInfoBO infoBO) {
        SongInfo info = infoBOConverter.infoBO2Info(infoBO);
        info.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        infoService.updateById(info);
    }

    @Override
    public PageResult<SongInfoBO> query(SongInfoBO infoBO) {
        PageResult<SongInfoBO> pageResult = new PageResult<>();
        Integer pageNo = infoBO.getPageNo();
        Integer pageSize = infoBO.getPageSize();
        Integer offset = (pageNo - 1) * pageSize;

        SongInfo info = infoBOConverter.infoBO2Info(infoBO);
        QueryWrapper<SongInfo> query = Wrappers.query(info);

        int count = (int) infoService.count(query);
        List<SongInfo> infoList = infoService.queryPage(info, offset, pageSize);

        List<SongInfoBO> infoBOList = infoBOConverter.infoList2InfoBOList(infoList);

        pageResult.setRecords(infoBOList);
        pageResult.setTotal(count);

        return pageResult;
    }
}
