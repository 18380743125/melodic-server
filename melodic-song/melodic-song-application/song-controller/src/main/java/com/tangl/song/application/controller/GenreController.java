package com.tangl.song.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.tangl.song.application.converter.SongGenreDTOConverter;
import com.tangl.song.application.dto.SongGenreDTO;
import com.tangl.song.common.entity.Result;
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
    public Result<?> add(@RequestBody SongGenreDTO genreDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("add song genre: {}", JSON.toJSONString(genreDTO));
            }

            Preconditions.checkArgument(!StringUtils.isBlank(genreDTO.getName()), "流派名称不能为空");

            SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
            Boolean flag = genreDomainService.add(genreBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("GenreController.add.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 更新歌曲流派信息
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SongGenreDTO genreDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("update genre: {}", JSON.toJSONString(genreDTO));
            }

            Preconditions.checkNotNull(genreDTO.getId(), "歌曲流派ID不能为空");

            SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
            Boolean flag = genreDomainService.update(genreBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("GenreController.update.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 删除歌曲流派信息
     */
    @DeleteMapping("/delete")
    public Result<?> delete(@RequestBody SongGenreDTO genreDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("delete genre: {}", JSON.toJSONString(genreDTO));
            }

            Preconditions.checkNotNull(genreDTO.getId(), "歌曲流派ID不能为空");

            SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
            Boolean flag = genreDomainService.delete(genreBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("GenreController.delete.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 获取歌曲流派信息
     */
    @GetMapping("/queryGenreList")
    public Result<?> queryGenreList(SongGenreDTO genreDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("query genre list: {}", JSON.toJSONString(genreDTO));
            }

            SongGenreBO genreBO = genreDTOConverter.genreDTO2GenreBO(genreDTO);
            List<SongGenreBO> genreBOList = genreDomainService.queryGenreList(genreBO);
            return Result.ok(genreBOList);

        } catch (Exception e) {
            log.error("GenreController.queryGenreList.error:{}", e.getMessage());
            return Result.fail(e.getMessage());
        }
    }

}
