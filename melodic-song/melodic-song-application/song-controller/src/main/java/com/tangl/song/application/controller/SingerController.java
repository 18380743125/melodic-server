package com.tangl.song.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.tangl.song.application.dto.MelodyArtistDTO;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.entity.Result;
import com.tangl.song.application.converter.MelodyArtistDTOConverter;
import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.domain.service.MelodyArtistDomainService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/singer")
@Slf4j
public class SingerController {

    @Resource
    private MelodyArtistDomainService artistDomainService;

    @Resource
    private MelodyArtistDTOConverter artistDTOConverter;

    /**
     * 新增歌手信息
     */
    @PostMapping("/add")
    public Result<?> add(@RequestBody MelodyArtistDTO artistDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("add artist: {}", JSON.toJSONString(artistDTO));
            }

            Preconditions.checkArgument(!StringUtils.isBlank(artistDTO.getName()), "姓名不能为空");
            Preconditions.checkNotNull(artistDTO.getGender(), "性别不能为空");
            Preconditions.checkNotNull(artistDTO.getBirthday(), "出生日期不能为空");

            MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
            Boolean flag = artistDomainService.add(artistBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("SingerController.add.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 更新歌手信息
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody MelodyArtistDTO artistDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("update artist: {}", JSON.toJSONString(artistDTO));
            }

            Preconditions.checkNotNull(artistDTO.getId(), "歌手ID不能为空");

            MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
            Boolean flag = artistDomainService.update(artistBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("SingerController.update.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 删除歌手信息
     */
    @DeleteMapping("/delete")
    public Result<?> delete(@RequestBody MelodyArtistDTO artistDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("delete artist: {}", JSON.toJSONString(artistDTO));
            }

            Preconditions.checkNotNull(artistDTO.getId(), "歌手ID不能为空");

            MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
            Boolean flag = artistDomainService.delete(artistBO);

            return flag ? Result.ok(true) : Result.fail(false);

        } catch (Exception e) {
            log.error("SingerController.delete.error:{}", e.getMessage(), e);
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 条件获取歌手信息
     */
    @PostMapping("/queryArtistPage")
    public Result<?> queryArtistPage(@RequestBody MelodyArtistDTO artistDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("query artist: {}", JSON.toJSONString(artistDTO));
            }

            MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
            PageResult<MelodyArtistBO> pageResult = artistDomainService.queryConditionPage(artistBO);
            return Result.ok(pageResult);

        } catch (Exception e) {
            log.error("SingerController.query.error:{}", e.getMessage());
            return Result.fail(e.getMessage());
        }
    }

}
