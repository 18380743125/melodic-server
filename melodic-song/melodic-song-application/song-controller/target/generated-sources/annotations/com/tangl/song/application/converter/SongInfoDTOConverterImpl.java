package com.tangl.song.application.converter;

import com.tangl.song.application.dto.SongInfoDTO;
import com.tangl.song.domain.entity.SongInfoBO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:22+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongInfoDTOConverterImpl implements SongInfoDTOConverter {

    @Override
    public SongInfoBO infoDTO2InfoBO(SongInfoDTO infoDTO) {
        if ( infoDTO == null ) {
            return null;
        }

        SongInfoBO songInfoBO = new SongInfoBO();

        songInfoBO.setId( infoDTO.getId() );
        songInfoBO.setName( infoDTO.getName() );
        songInfoBO.setAlbumName( infoDTO.getAlbumName() );
        songInfoBO.setSongUrl( infoDTO.getSongUrl() );
        songInfoBO.setDuration( infoDTO.getDuration() );
        songInfoBO.setCover( infoDTO.getCover() );
        songInfoBO.setStatus( infoDTO.getStatus() );
        try {
            if ( infoDTO.getReleaseDate() != null ) {
                songInfoBO.setReleaseDate( new SimpleDateFormat().parse( infoDTO.getReleaseDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        songInfoBO.setExtJson( infoDTO.getExtJson() );
        songInfoBO.setIsDeleted( infoDTO.getIsDeleted() );

        return songInfoBO;
    }
}
