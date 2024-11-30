package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.infra.basic.entity.MelodyArtist;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-30T12:39:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class MelodyArtistBOConverterImpl implements MelodyArtistBOConverter {

    @Override
    public MelodyArtist artistBO2Artist(MelodyArtistBO artistBO) {
        if ( artistBO == null ) {
            return null;
        }

        MelodyArtist melodyArtist = new MelodyArtist();

        melodyArtist.setId( artistBO.getId() );
        melodyArtist.setName( artistBO.getName() );
        melodyArtist.setGender( artistBO.getGender() );
        melodyArtist.setBirthday( artistBO.getBirthday() );
        melodyArtist.setNationality( artistBO.getNationality() );
        melodyArtist.setIntroduce( artistBO.getIntroduce() );
        melodyArtist.setAvatar( artistBO.getAvatar() );
        melodyArtist.setFansCount( artistBO.getFansCount() );
        melodyArtist.setStatus( artistBO.getStatus() );

        return melodyArtist;
    }

    @Override
    public List<MelodyArtistBO> artistList2ArtistBOList(List<MelodyArtist> artistList) {
        if ( artistList == null ) {
            return null;
        }

        List<MelodyArtistBO> list = new ArrayList<MelodyArtistBO>( artistList.size() );
        for ( MelodyArtist melodyArtist : artistList ) {
            list.add( melodyArtistToMelodyArtistBO( melodyArtist ) );
        }

        return list;
    }

    protected MelodyArtistBO melodyArtistToMelodyArtistBO(MelodyArtist melodyArtist) {
        if ( melodyArtist == null ) {
            return null;
        }

        MelodyArtistBO melodyArtistBO = new MelodyArtistBO();

        melodyArtistBO.setId( melodyArtist.getId() );
        melodyArtistBO.setName( melodyArtist.getName() );
        melodyArtistBO.setGender( melodyArtist.getGender() );
        melodyArtistBO.setBirthday( melodyArtist.getBirthday() );
        melodyArtistBO.setNationality( melodyArtist.getNationality() );
        melodyArtistBO.setIntroduce( melodyArtist.getIntroduce() );
        melodyArtistBO.setAvatar( melodyArtist.getAvatar() );
        melodyArtistBO.setFansCount( melodyArtist.getFansCount() );
        melodyArtistBO.setStatus( melodyArtist.getStatus() );

        return melodyArtistBO;
    }
}
