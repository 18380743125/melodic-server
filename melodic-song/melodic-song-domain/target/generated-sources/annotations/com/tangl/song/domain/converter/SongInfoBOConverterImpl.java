package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongInfoBO;
import com.tangl.song.infra.basic.entity.SongInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongInfoBOConverterImpl implements SongInfoBOConverter {

    @Override
    public SongInfo infoBO2Info(SongInfoBO infoBO) {
        if ( infoBO == null ) {
            return null;
        }

        SongInfo songInfo = new SongInfo();

        songInfo.setId( infoBO.getId() );
        songInfo.setName( infoBO.getName() );
        songInfo.setAlbumName( infoBO.getAlbumName() );
        songInfo.setSongUrl( infoBO.getSongUrl() );
        songInfo.setDuration( infoBO.getDuration() );
        songInfo.setCover( infoBO.getCover() );
        songInfo.setStatus( infoBO.getStatus() );
        songInfo.setReleaseDate( infoBO.getReleaseDate() );
        songInfo.setExtJson( infoBO.getExtJson() );
        songInfo.setIsDeleted( infoBO.getIsDeleted() );

        return songInfo;
    }
}
