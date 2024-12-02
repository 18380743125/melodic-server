package com.tangl.song.domain.entity;

import com.tangl.song.common.entity.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class SongLyricBO extends PageInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 8420066516069401737L;

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

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}