package com.tangl.song.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.song.application.converter.SongInfoDTOConverter;
import com.tangl.song.application.dto.SongInfoDTO;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.response.R;
import com.tangl.song.domain.entity.SongInfoBO;
import com.tangl.song.domain.service.SongInfoDomainService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongInfoController {

    @Resource
    private SongInfoDomainService infoDomainService;

    @Resource
    private SongInfoDTOConverter infoDTOConverter;

    /**
     * 新增歌曲信息
     */
    @PostMapping("/add")
    public R<?> add(@RequestBody SongInfoDTO infoDTO) {

        Preconditions.checkArgument(!StringUtils.isBlank(infoDTO.getName()), "歌曲名称不能为空");
        Preconditions.checkArgument(!StringUtils.isBlank(infoDTO.getSongUrl()), "歌曲链接不能为空");
        Preconditions.checkNotNull(infoDTO.getDuration(), "歌曲时长不能为空");
        Preconditions.checkArgument(!StringUtils.isBlank(infoDTO.getCover()), "歌曲封面链接不能为空");

        SongInfoBO infoBO = infoDTOConverter.infoDTO2InfoBO(infoDTO);
        infoDomainService.add(infoBO);

        return R.success();
    }

    /**
     * 更新歌曲信息
     */
    @PutMapping("/update")
    public R<?> update(@RequestBody SongInfoDTO infoDTO) {

        Preconditions.checkNotNull(infoDTO.getId(), "歌曲信息ID不能为空");

        SongInfoBO infoBO = infoDTOConverter.infoDTO2InfoBO(infoDTO);
        infoDomainService.update(infoBO);

        return R.success();
    }

    /**
     * 删除歌曲信息
     */
    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody SongInfoDTO infoDTO) {

        Preconditions.checkNotNull(infoDTO.getId(), "歌曲信息ID不能为空");

        SongInfoBO infoBO = infoDTOConverter.infoDTO2InfoBO(infoDTO);
        infoDomainService.delete(infoBO);

        return R.success();
    }

    /**
     * 获取歌曲信息
     */
    @GetMapping("/query")
    public R<PageResult<List<SongInfoBO>>> queryGenreList(SongInfoDTO infoDTO) {

        SongInfoBO infoBO = infoDTOConverter.infoDTO2InfoBO(infoDTO);

        PageResult<List<SongInfoBO>> pageResult = infoDomainService.query(infoBO);
        return R.data(pageResult);
    }
}
