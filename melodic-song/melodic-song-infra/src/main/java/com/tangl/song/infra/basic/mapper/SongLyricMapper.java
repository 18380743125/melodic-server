package com.tangl.song.infra.basic.mapper;

import com.tangl.song.infra.basic.entity.SongLyric;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 歌词信息表(SongLyric)表数据库访问层
 */
public interface SongLyricMapper extends BaseMapper<SongLyric> {

    List<SongLyric> queryPage(@Param("lyric") SongLyric lyric, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

}
