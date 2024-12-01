package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongInfoDTO;
import com.tangl.song.domain.entity.SongInfoBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongInfoDTOConverter {

    SongInfoBO infoDTO2InfoBO(SongInfoDTO infoDTO);

}
