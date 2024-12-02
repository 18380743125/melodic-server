package com.tangl.song.domain.converter;

import com.tangl.song.domain.entity.SongLyricBO;
import com.tangl.song.infra.basic.entity.SongLyric;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SongLyricBOConverter {

    SongLyric lyricBO2Lyric(SongLyricBO infoBO);

    List<SongLyricBO> lyricList2LyricBOList(List<SongLyric> lyricList);

}
