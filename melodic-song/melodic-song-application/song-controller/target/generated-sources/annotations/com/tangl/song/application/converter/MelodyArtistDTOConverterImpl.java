package com.tangl.song.application.converter;

import com.tangl.song.application.dto.MelodyArtistDTO;
import com.tangl.song.domain.entity.MelodyArtistBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-01T23:34:22+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Homebrew)"
)
@Component
public class MelodyArtistDTOConverterImpl implements MelodyArtistDTOConverter {

    @Override
    public MelodyArtistBO artistDTO2ArtistBO(MelodyArtistDTO artistDTO) {
        if ( artistDTO == null ) {
            return null;
        }

        MelodyArtistBO melodyArtistBO = new MelodyArtistBO();

        melodyArtistBO.setPageNo( artistDTO.getPageNo() );
        melodyArtistBO.setPageSize( artistDTO.getPageSize() );
        melodyArtistBO.setId( artistDTO.getId() );
        melodyArtistBO.setName( artistDTO.getName() );
        melodyArtistBO.setGender( artistDTO.getGender() );
        melodyArtistBO.setBirthday( artistDTO.getBirthday() );
        melodyArtistBO.setNationality( artistDTO.getNationality() );
        melodyArtistBO.setIntroduce( artistDTO.getIntroduce() );
        melodyArtistBO.setAvatar( artistDTO.getAvatar() );
        melodyArtistBO.setFansCount( artistDTO.getFansCount() );
        melodyArtistBO.setStatus( artistDTO.getStatus() );

        return melodyArtistBO;
    }

    @Override
    public List<MelodyArtistDTO> artistBOList2ArtistDTOList(List<MelodyArtistBO> artistBOList) {
        if ( artistBOList == null ) {
            return null;
        }

        List<MelodyArtistDTO> list = new ArrayList<MelodyArtistDTO>( artistBOList.size() );
        for ( MelodyArtistBO melodyArtistBO : artistBOList ) {
            list.add( melodyArtistBOToMelodyArtistDTO( melodyArtistBO ) );
        }

        return list;
    }

    protected MelodyArtistDTO melodyArtistBOToMelodyArtistDTO(MelodyArtistBO melodyArtistBO) {
        if ( melodyArtistBO == null ) {
            return null;
        }

        MelodyArtistDTO melodyArtistDTO = new MelodyArtistDTO();

        melodyArtistDTO.setPageNo( melodyArtistBO.getPageNo() );
        melodyArtistDTO.setPageSize( melodyArtistBO.getPageSize() );
        melodyArtistDTO.setId( melodyArtistBO.getId() );
        melodyArtistDTO.setName( melodyArtistBO.getName() );
        melodyArtistDTO.setGender( melodyArtistBO.getGender() );
        melodyArtistDTO.setBirthday( melodyArtistBO.getBirthday() );
        melodyArtistDTO.setNationality( melodyArtistBO.getNationality() );
        melodyArtistDTO.setIntroduce( melodyArtistBO.getIntroduce() );
        melodyArtistDTO.setAvatar( melodyArtistBO.getAvatar() );
        melodyArtistDTO.setFansCount( melodyArtistBO.getFansCount() );
        melodyArtistDTO.setStatus( melodyArtistBO.getStatus() );

        return melodyArtistDTO;
    }
}
