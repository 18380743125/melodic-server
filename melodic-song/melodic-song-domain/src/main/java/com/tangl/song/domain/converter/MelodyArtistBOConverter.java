package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.infra.basic.entity.MelodyArtist;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MelodyArtistBOConverter {

    MelodyArtist artistBO2Artist(MelodyArtistBO artistBO);

    List<MelodyArtistBO> artistList2ArtistBOList(MelodyArtistBO artistBO);
}
