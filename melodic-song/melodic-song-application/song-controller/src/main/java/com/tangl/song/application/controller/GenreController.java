package com.tangl.song.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.tangl.song.application.converter.SongGenreDTOConverter;
import com.tangl.song.application.dto.SongGenreDTO;
import com.tangl.song.common.response.R;
import com.tangl.song.domain.entity.SongGenreBO;
import com.tangl.song.domain.service.SongGenreDomainService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
@Slf4j
public class GenreController {

    @Resource
    private SongGenreDTOConverter genreDTOConverter;

    @Resource
    private SongGenreDomainService genreDomainService;

    /**
     * 新增歌曲流派信息
     */
    @PostMapping("/add")
    public R<?> add(@RequestBody SongGenreDTO genreDTO) {

        Preconditions.checkArgument(!StringUtils.isBlank(genreDTO.getName()), "流派名称不能为空");

        SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
        genreDomainService.add(genreBO);

        return R.success();
    }

    /**
     * 更新歌曲流派信息
     */
    @PutMapping("/update")
    public R<?> update(@RequestBody SongGenreDTO genreDTO) {

        Preconditions.checkNotNull(genreDTO.getId(), "歌曲流派ID不能为空");

        SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
        genreDomainService.update(genreBO);

        return R.success();
    }

    /**
     * 删除歌曲流派信息
     */
    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody SongGenreDTO genreDTO) {

        Preconditions.checkNotNull(genreDTO.getId(), "歌曲流派ID不能为空");

        SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
        genreDomainService.delete(genreBO);

        return R.success();
    }

    /**
     * 获取歌曲流派信息
     */
    @GetMapping("/queryGenreList")
    public R<?> queryGenreList(SongGenreDTO genreDTO) {

        SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
        List<SongGenreBO> genreBOList = genreDomainService.queryGenreList(genreBO);
        return R.data(genreBOList);
    }

}
