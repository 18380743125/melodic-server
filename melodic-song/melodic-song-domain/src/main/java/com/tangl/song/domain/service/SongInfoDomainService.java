package com.tangl.song.domain.service;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.domain.entity.SongInfoBO;

import java.util.List;

public interface SongInfoDomainService {

    /**
     * 新增歌曲信息
     */
    void add(SongInfoBO infoBO);

    /**
     * 修改歌曲信息
     */
    void update(SongInfoBO infoBO);

    /**
     * 删除歌曲信息
     */
    void delete(SongInfoBO infoBO);

    /**
     * 查询歌曲列表
     */
    PageResult<List<SongInfoBO>> query(SongInfoBO infoBO);
}
