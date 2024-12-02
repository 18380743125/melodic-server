package com.tangl.song.infra.basic.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangl.song.infra.basic.entity.SongLyric;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 歌词信息表(SongLyric)表服务实现类
 */
public interface SongLyricService extends IService<SongLyric> {

    /**
     * 分页条件查询歌词
     */
    List<SongLyric> queryPage(SongLyric lyric, Integer offset, Integer pageSize);

}
