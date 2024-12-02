package com.tangl.song.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.song.infra.basic.entity.SongLyric;
import com.tangl.song.infra.basic.mapper.SongLyricMapper;
import com.tangl.song.infra.basic.service.SongLyricService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌词信息表(SongLyric)表服务实现类
 */
@Service
public class SongLyricServiceImpl extends ServiceImpl<SongLyricMapper, SongLyric>
        implements SongLyricService {

    @Resource
    private SongLyricMapper songLyricMapper;

    @Override
    public List<SongLyric> queryPage(SongLyric lyric, Integer offset, Integer pageSize) {
        return songLyricMapper.queryPage(lyric, offset, pageSize);
    }
}
