package com.tangl.song.infra.basic.service;

import com.tangl.song.infra.basic.entity.SongInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 歌曲信息表(SongInfo)表服务实现类
 */
public interface SongInfoService extends IService<SongInfo> {

    /**
     * 分页条件查询歌曲
     */
    List<SongInfo> queryPage(SongInfo info, Integer offset, Integer pageSize);
}
