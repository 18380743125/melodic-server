package com.tangl.song.infra.basic.mapper;

import com.tangl.song.infra.basic.entity.SongInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 歌曲信息表(SongInfo)表数据库访问层
 */
public interface SongInfoMapper extends BaseMapper<SongInfo> {

    List<SongInfo> queryPage(@Param("info") SongInfo info, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

}
