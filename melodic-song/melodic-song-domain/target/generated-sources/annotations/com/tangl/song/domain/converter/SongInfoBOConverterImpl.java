package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongInfoBO;
import com.tangl.song.infra.basic.entity.SongInfo;
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

    @Override
    public List<SongInfoBO> infoList2InfoBOList(List<SongInfo> infoList) {
        if ( infoList == null ) {
            return null;
        }

        List<SongInfoBO> list = new ArrayList<SongInfoBO>( infoList.size() );
        for ( SongInfo songInfo : infoList ) {
            list.add( songInfoToSongInfoBO( songInfo ) );
        }

        return list;
    }

    protected SongInfoBO songInfoToSongInfoBO(SongInfo songInfo) {
        if ( songInfo == null ) {
            return null;
        }

        SongInfoBO songInfoBO = new SongInfoBO();

        songInfoBO.setId( songInfo.getId() );
        songInfoBO.setName( songInfo.getName() );
        songInfoBO.setAlbumName( songInfo.getAlbumName() );
        songInfoBO.setSongUrl( songInfo.getSongUrl() );
        songInfoBO.setDuration( songInfo.getDuration() );
        songInfoBO.setCover( songInfo.getCover() );
        songInfoBO.setStatus( songInfo.getStatus() );
        songInfoBO.setReleaseDate( songInfo.getReleaseDate() );
        songInfoBO.setExtJson( songInfo.getExtJson() );
        songInfoBO.setIsDeleted( songInfo.getIsDeleted() );

        return songInfoBO;
    }
}
