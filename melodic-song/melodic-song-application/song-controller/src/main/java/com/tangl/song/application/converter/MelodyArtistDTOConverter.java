package com.tangl.song.application.converter;

import com.tangl.song.application.dto.MelodyArtistDTO;
import com.tangl.song.domain.entity.MelodyArtistBO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MelodyArtistDTOConverter {

    MelodyArtistBO artistDTO2ArtistBO(MelodyArtistDTO artistDTO);

    List<MelodyArtistDTO> artistBOList2ArtistDTOList(List<MelodyArtistBO> artistBOList);
}
