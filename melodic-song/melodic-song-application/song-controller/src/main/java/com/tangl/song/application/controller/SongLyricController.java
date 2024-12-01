package com.tangl.song.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.song.application.converter.SongLyricDTOConverter;
import com.tangl.song.application.dto.SongLyricDTO;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.response.R;
import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.domain.service.SongLyricDomainService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongLyricController {

    @Resource
    private SongLyricDomainService lyricDomainService;

    @Resource
    private SongLyricDTOConverter lyricDTOConverter;

    /**
     * 新增歌词信息
     */
    @PostMapping("/add")
    public R<?> add(@RequestBody SongLyricDTO lyricDTO) {

        Preconditions.checkNotNull(lyricDTO.getSongId(), "歌曲id不能为空");
        Preconditions.checkArgument(!StringUtils.isBlank(lyricDTO.getText()), "歌词不能为空");

        SongLyricBO lyricBO = lyricDTOConverter.lyricDTO2LyricBO(lyricDTO);
        lyricDomainService.add(lyricBO);

        return R.success();
    }

    /**
     * 更新歌词信息
     */
    @PutMapping("/update")
    public R<?> update(@RequestBody SongLyricDTO lyricDTO) {

        Preconditions.checkNotNull(lyricDTO.getId(), "歌词信息ID不能为空");

        SongLyricBO lyricBO = lyricDTOConverter.lyricDTO2LyricBO(lyricDTO);
        lyricDomainService.update(lyricBO);

        return R.success();
    }

    /**
     * 删除歌曲信息
     */
    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody SongLyricDTO lyricDTO) {

        Preconditions.checkNotNull(lyricDTO.getId(), "歌词信息ID不能为空");

        SongLyricBO lyricBO = lyricDTOConverter.lyricDTO2LyricBO(lyricDTO);
        lyricDomainService.delete(lyricBO);

        return R.success();
    }

    /**
     * 获取歌曲信息
     */
    @GetMapping("/query")
    public R<PageResult<List<SongLyricBO>>> queryGenreList(SongLyricDTO lyricDTO) {

        SongLyricBO lyricBO = lyricDTOConverter.lyricDTO2LyricBO(lyricDTO);

        PageResult<List<SongLyricBO>> pageResult = lyricDomainService.query(lyricBO);
        return R.data(pageResult);
    }
}
