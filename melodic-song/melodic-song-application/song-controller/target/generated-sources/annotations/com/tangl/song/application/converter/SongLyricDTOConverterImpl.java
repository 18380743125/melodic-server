package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongLyricDTO;
import com.tangl.song.domain.entity.SongLyricBO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:22+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongLyricDTOConverterImpl implements SongLyricDTOConverter {

    @Override
    public SongLyricBO lyricDTO2LyricBO(SongLyricDTO lyricDTO) {
        if ( lyricDTO == null ) {
            return null;
        }

        SongLyricBO songLyricBO = new SongLyricBO();

        songLyricBO.setId( lyricDTO.getId() );
        songLyricBO.setSongId( lyricDTO.getSongId() );
        songLyricBO.setText( lyricDTO.getText() );

        return songLyricBO;
    }
}
