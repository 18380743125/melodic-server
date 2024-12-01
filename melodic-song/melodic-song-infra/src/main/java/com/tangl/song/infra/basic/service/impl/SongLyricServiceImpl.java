package com.tangl.song.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.song.infra.basic.entity.SongLyric;
import com.tangl.song.infra.basic.mapper.SongLyricMapper;
import com.tangl.song.infra.basic.service.SongLyricService;
import org.springframework.stereotype.Service;

/**
 * 歌词信息表(SongLyric)表服务实现类
 */
@Service
public class SongLyricServiceImpl extends ServiceImpl<SongLyricMapper, SongLyric>
        implements SongLyricService {

}
