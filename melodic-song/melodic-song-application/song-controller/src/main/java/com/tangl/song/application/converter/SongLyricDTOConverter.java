package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongLyricDTO;
import com.tangl.song.domain.entity.SongLyricBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongLyricDTOConverter {

    SongLyricBO lyricDTO2LyricBO(SongLyricDTO lyricDTO);

}
