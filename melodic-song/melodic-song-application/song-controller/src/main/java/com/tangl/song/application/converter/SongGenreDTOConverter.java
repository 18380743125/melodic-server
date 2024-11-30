package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongGenreDTO;
import com.tangl.song.domain.entity.SongGenreBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongGenreDTOConverter {

    SongGenreBO genreDTO2GenreBO(SongGenreDTO genreDTO);

}
