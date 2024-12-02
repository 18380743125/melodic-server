package com.tangl.song.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class SongLyricDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4208517781707161148L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 歌曲id
     */
    private Long songId;

    /**
     * 歌词内容
     */
    private String text;

}