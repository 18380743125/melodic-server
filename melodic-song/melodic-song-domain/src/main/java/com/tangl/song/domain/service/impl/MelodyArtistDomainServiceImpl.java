package com.tangl.song.domain.service.impl;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.enums.IsDeletedFlagEnum;
import com.tangl.song.common.enums.StatusEnum;
import com.tangl.song.domain.converter.MelodyArtistBOConverter;
import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.domain.service.MelodyArtistDomainService;
import com.tangl.song.infra.basic.entity.MelodyArtist;
import com.tangl.song.infra.basic.service.MelodyArtistService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MelodyArtistDomainServiceImpl implements MelodyArtistDomainService {

    @Resource
    private MelodyArtistService artistService;

    @Resource
    private MelodyArtistBOConverter artistBOConverter;

    @Override
    public Boolean add(MelodyArtistBO artistBO) {
        MelodyArtist artist = artistBOConverter.artistBO2Artist(artistBO);
        artist.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        artist.setStatus(StatusEnum.ENABLE.getCode());
        return artistService.insert(artist) > 0;
    }

    @Override
    public void update(MelodyArtistBO artistBO) {
        MelodyArtist artist = artistBOConverter.artistBO2Artist(artistBO);
        artistService.update(artist);
    }

    @Override
    public void delete(MelodyArtistBO artistBO) {
        MelodyArtist artist = artistBOConverter.artistBO2Artist(artistBO);
        artist.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        this.artistService.update(artist);
    }

    @Override
    public PageResult<MelodyArtistBO> queryConditionPage(MelodyArtistBO artistBO) {
        PageResult<MelodyArtistBO> pageResult = new PageResult<>();
        pageResult.setPageNo(artistBO.getPageNo());
        pageResult.setPageSize(artistBO.getPageSize());
        int offset = (artistBO.getPageNo() - 1) * artistBO.getPageSize();

        // 查询数量
        MelodyArtist artist = artistBOConverter.artistBO2Artist(artistBO);
        int count = artistService.countByCondition(artist);
        if (count == 0) {
            return pageResult;
        }

        List<MelodyArtist> artistList = artistService.queryPage(artist, offset, artistBO.getPageSize());

        List<MelodyArtistBO> artistBOList = artistBOConverter.artistList2ArtistBOList(artistList);
        pageResult.setRecords(artistBOList);
        pageResult.setTotal(count);
        return pageResult;
    }
}
