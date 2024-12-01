package com.tangl.song.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.song.application.converter.MelodyArtistDTOConverter;
import com.tangl.song.application.dto.MelodyArtistDTO;
import com.tangl.song.common.entity.PageResult;
import com.tangl.song.common.response.R;
import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.domain.service.MelodyArtistDomainService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artist")
@Slf4j
public class ArtistController {

    @Resource
    private MelodyArtistDomainService artistDomainService;

    @Resource
    private MelodyArtistDTOConverter artistDTOConverter;

    /**
     * 新增歌手信息
     */
    @PostMapping("/add")
    public R<?> add(@RequestBody MelodyArtistDTO artistDTO) {

        Preconditions.checkArgument(!StringUtils.isBlank(artistDTO.getName()), "姓名不能为空");
        Preconditions.checkNotNull(artistDTO.getGender(), "性别不能为空");
        Preconditions.checkNotNull(artistDTO.getBirthday(), "出生日期不能为空");

        MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
        artistDomainService.add(artistBO);
        return R.success();
    }

    /**
     * 更新歌手信息
     */
    @PutMapping("/update")
    public R<?> update(@RequestBody MelodyArtistDTO artistDTO) {

        Preconditions.checkNotNull(artistDTO.getId(), "歌手ID不能为空");

        MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
        artistDomainService.update(artistBO);

        return R.success();
    }

    /**
     * 删除歌手信息
     */
    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody MelodyArtistDTO artistDTO) {

        Preconditions.checkNotNull(artistDTO.getId(), "歌手ID不能为空");

        MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
        artistDomainService.delete(artistBO);

        return R.success();
    }

    /**
     * 条件获取歌手信息
     */
    @PostMapping("/queryArtistPage")
    public R<PageResult<MelodyArtistBO>> queryArtistPage(@RequestBody MelodyArtistDTO artistDTO) {

        MelodyArtistBO artistBO = artistDTOConverter.artistDTO2ArtistBO(artistDTO);
        PageResult<MelodyArtistBO> pageResult = artistDomainService.queryConditionPage(artistBO);
        return R.data(pageResult);
    }

}
