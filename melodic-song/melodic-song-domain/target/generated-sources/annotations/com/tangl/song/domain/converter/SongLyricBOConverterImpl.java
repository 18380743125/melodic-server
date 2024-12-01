package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.infra.basic.entity.SongLyric;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongLyricBOConverterImpl implements SongLyricBOConverter {

    @Override
    public SongLyric lyricBO2Lyric(SongLyricBO infoBO) {
        if ( infoBO == null ) {
            return null;
        }

        SongLyric songLyric = new SongLyric();

        songLyric.setId( infoBO.getId() );
        songLyric.setSongId( infoBO.getSongId() );
        songLyric.setText( infoBO.getText() );
        songLyric.setCreateBy( infoBO.getCreateBy() );
        songLyric.setCreateTime( infoBO.getCreateTime() );
        songLyric.setUpdateBy( infoBO.getUpdateBy() );
        songLyric.setUpdateTime( infoBO.getUpdateTime() );
        songLyric.setIsDeleted( infoBO.getIsDeleted() );

        return songLyric;
    }
}
