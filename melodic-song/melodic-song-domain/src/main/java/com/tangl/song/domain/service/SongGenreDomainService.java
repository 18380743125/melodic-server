package com.tangl.song.domain.service;

import com.tangl.song.domain.entity.SongGenreBO;

import java.util.List;

public interface SongGenreDomainService {

    /**
     * 新增歌曲流派
     */
    void add(SongGenreBO genreBO);

    /**
     * 修改歌曲流派信息
     */
    void update(SongGenreBO genreBO);

    /**
     * 删除歌曲流派信息
     */
    void delete(SongGenreBO genreBO);

    /**
     * 查询歌曲流派列表
     */
    List<SongGenreBO> queryGenreList(SongGenreBO genreBO);
}
