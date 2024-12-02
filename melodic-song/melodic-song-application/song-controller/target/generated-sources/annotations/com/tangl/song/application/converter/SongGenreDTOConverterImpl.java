package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongGenreDTO;
import com.tangl.song.domain.entity.SongGenreBO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T22:24:13+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongGenreDTOConverterImpl implements SongGenreDTOConverter {

    @Override
    public SongGenreBO genreDTO2GenreBO(SongGenreDTO genreDTO) {
        if ( genreDTO == null ) {
            return null;
        }

        SongGenreBO songGenreBO = new SongGenreBO();

        songGenreBO.setId( genreDTO.getId() );
        songGenreBO.setName( genreDTO.getName() );
        songGenreBO.setRemark( genreDTO.getRemark() );
        songGenreBO.setOrigin( genreDTO.getOrigin() );
        songGenreBO.setFeature( genreDTO.getFeature() );
        songGenreBO.setParentId( genreDTO.getParentId() );

        return songGenreBO;
    }
}
