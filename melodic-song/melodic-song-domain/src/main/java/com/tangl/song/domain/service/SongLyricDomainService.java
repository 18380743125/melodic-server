package com.tangl.song.domain.service;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.domain.entity.SongLyricBO;

public interface SongLyricDomainService {

    /**
     * 新增歌词信息
     */
    void add(SongLyricBO lyricBO);

    /**
     * 修改歌词信息
     */
    void update(SongLyricBO lyricBO);

    /**
     * 删除歌词信息
     */
    void delete(SongLyricBO lyricBO);

    /**
     * 查询歌词列表
     */
    PageResult<SongLyricBO> query(SongLyricBO lyricBO);
}
