package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.infra.basic.entity.SongLyric;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-02T22:24:12+0800",
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
        songLyric.setIsDeleted( infoBO.getIsDeleted() );

        return songLyric;
    }

    @Override
    public List<SongLyricBO> lyricList2LyricBOList(List<SongLyric> lyricList) {
        if ( lyricList == null ) {
            return null;
        }

        List<SongLyricBO> list = new ArrayList<SongLyricBO>( lyricList.size() );
        for ( SongLyric songLyric : lyricList ) {
            list.add( songLyricToSongLyricBO( songLyric ) );
        }

        return list;
    }

    protected SongLyricBO songLyricToSongLyricBO(SongLyric songLyric) {
        if ( songLyric == null ) {
            return null;
        }

        SongLyricBO songLyricBO = new SongLyricBO();

        songLyricBO.setId( songLyric.getId() );
        songLyricBO.setSongId( songLyric.getSongId() );
        songLyricBO.setText( songLyric.getText() );
        songLyricBO.setIsDeleted( songLyric.getIsDeleted() );

        return songLyricBO;
    }
}
