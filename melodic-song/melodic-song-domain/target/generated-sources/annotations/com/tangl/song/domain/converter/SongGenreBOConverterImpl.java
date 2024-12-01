package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongGenreBO;
import com.tangl.song.infra.basic.entity.SongGenre;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class SongGenreBOConverterImpl implements SongGenreBOConverter {

    @Override
    public SongGenre genreBO2Genre(SongGenreBO genreBO) {
        if ( genreBO == null ) {
            return null;
        }

        SongGenre songGenre = new SongGenre();

        songGenre.setId( genreBO.getId() );
        songGenre.setName( genreBO.getName() );
        songGenre.setRemark( genreBO.getRemark() );
        songGenre.setOrigin( genreBO.getOrigin() );
        songGenre.setFeature( genreBO.getFeature() );
        songGenre.setParentId( genreBO.getParentId() );

        return songGenre;
    }

    @Override
    public List<SongGenreBO> genreList2GenreBOList(List<SongGenre> genreList) {
        if ( genreList == null ) {
            return null;
        }

        List<SongGenreBO> list = new ArrayList<SongGenreBO>( genreList.size() );
        for ( SongGenre songGenre : genreList ) {
            list.add( songGenreToSongGenreBO( songGenre ) );
        }

        return list;
    }

    protected SongGenreBO songGenreToSongGenreBO(SongGenre songGenre) {
        if ( songGenre == null ) {
            return null;
        }

        SongGenreBO songGenreBO = new SongGenreBO();

        songGenreBO.setId( songGenre.getId() );
        songGenreBO.setName( songGenre.getName() );
        songGenreBO.setRemark( songGenre.getRemark() );
        songGenreBO.setOrigin( songGenre.getOrigin() );
        songGenreBO.setFeature( songGenre.getFeature() );
        songGenreBO.setParentId( songGenre.getParentId() );

        return songGenreBO;
    }
}
