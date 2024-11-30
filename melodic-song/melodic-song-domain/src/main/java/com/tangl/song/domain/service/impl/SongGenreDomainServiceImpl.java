package com.tangl.song.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.tangl.song.common.enums.IsDeletedFlagEnum;
import com.tangl.song.domain.converter.SongGenreBOConverter;
import com.tangl.song.domain.entity.SongGenreBO;
import com.tangl.song.domain.service.SongGenreDomainService;
import com.tangl.song.infra.basic.entity.SongGenre;
import com.tangl.song.infra.basic.service.SongGenreService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongGenreDomainServiceImpl implements SongGenreDomainService {

    @Resource
    private SongGenreBOConverter genreBOConverter;

    @Resource
    private SongGenreService genreService;

    @Override
    public Boolean add(SongGenreBO genreBO) {
        String name = genreBO.getName();
        QueryWrapper<SongGenre> query = Wrappers.query();
        query.eq("name", name);
        SongGenre genreDB = genreService.getOne(query);
        if (genreDB != null) {
            return false;
        }

        SongGenre genre = genreBOConverter.genreBO2Genre(genreBO);
        genre.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        return genreService.save(genre);
    }

    @Override
    public Boolean update(SongGenreBO genreBO) {
        SongGenre genre = genreBOConverter.genreBO2Genre(genreBO);
        return genreService.updateById(genre);
    }

    @Override
    public Boolean delete(SongGenreBO genreBO) {
        SongGenre genre = genreBOConverter.genreBO2Genre(genreBO);
        genre.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        return genreService.updateById(genre);
    }

    @Override
    public List<SongGenreBO> queryGenreList(SongGenreBO genreBO) {
        SongGenre genre = genreBOConverter.genreBO2Genre(genreBO);
        QueryWrapper<SongGenre> wrapper = Wrappers.query(genre);
        List<SongGenre> genreList = genreService.list(wrapper);
        return genreBOConverter.genreList2GenreBOList(genreList);
    }
}
