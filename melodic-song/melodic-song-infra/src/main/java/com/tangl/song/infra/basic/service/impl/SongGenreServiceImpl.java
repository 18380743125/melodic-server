package com.tangl.song.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.song.infra.basic.entity.SongGenre;
import com.tangl.song.infra.basic.service.SongGenreService;
import com.tangl.song.infra.basic.mapper.SongGenreMapper;
import org.springframework.stereotype.Service;

/**
 * 歌曲流派表(SongGenre)表服务实现类
 */
@Service
public class SongGenreServiceImpl extends ServiceImpl<SongGenreMapper, SongGenre>
        implements SongGenreService {

}
