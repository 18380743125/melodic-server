package com.tangl.song.domain.service;

import com.tangl.song.common.entity.PageResult;
import com.tangl.song.domain.entity.SongLyricBO;

import java.util.List;

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
    PageResult<List<SongLyricBO>> query(SongLyricBO lyricBO);
}
