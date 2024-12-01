package com.tangl.song.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.song.infra.basic.entity.SongInfo;
import com.tangl.song.infra.basic.service.SongInfoService;
import com.tangl.song.infra.basic.mapper.SongInfoMapper;
import org.springframework.stereotype.Service;

/**
 * 歌曲信息表(SongInfo)表服务实现类
 */
@Service
public class SongInfoServiceImpl extends ServiceImpl<SongInfoMapper, SongInfo>
        implements SongInfoService {

}
