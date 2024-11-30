package com.tangl.song.domain.service;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.domain.entity.MelodyArtistBO;

public interface MelodyArtistDomainService {

    /**
     * 新增歌手信息
     */
    Boolean add(MelodyArtistBO artistBO);

    /**
     * 更新歌手信息
     */
    Boolean update(MelodyArtistBO artistBO);

    /**
     * 删除歌手信息
     */
    Boolean delete(MelodyArtistBO artistBO);

    /**
     * 条件分页查询歌手
     */
    PageResult<MelodyArtistBO> queryConditionPage(MelodyArtistBO artistBO);
}
