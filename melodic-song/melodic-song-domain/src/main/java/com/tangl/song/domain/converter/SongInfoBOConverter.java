package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongInfoBO;
import com.tangl.song.infra.basic.entity.SongInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongInfoBOConverter {

    SongInfo infoBO2Info(SongInfoBO infoBO);

}
