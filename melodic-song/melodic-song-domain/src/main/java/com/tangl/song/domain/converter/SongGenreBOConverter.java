package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.MelodyArtistBO;
import com.tangl.song.domain.entity.SongGenreBO;
import com.tangl.song.infra.basic.entity.MelodyArtist;
import com.tangl.song.infra.basic.entity.SongGenre;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SongGenreBOConverter {

    SongGenre genreBO2Genre(SongGenreBO genreBO);

    List<SongGenreBO> genreList2GenreBOList(List<SongGenre> genreList);
}
