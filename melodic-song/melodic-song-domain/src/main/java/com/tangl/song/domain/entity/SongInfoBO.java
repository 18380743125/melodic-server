package com.tangl.song.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class SongInfoBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 489493997516844896L;

    private Long id;

    /**
     * 歌曲名称
     */
    private String name;

    /**
     * 专辑名称
     */
    private String albumName;

    /**
     * 歌曲链接
     */
    private String songUrl;

    /**
     * 时长
     */
    private Integer duration;

    /**
     * 封面
     */
    private String cover;

    /**
     * 状态 0启用 1禁用
     */
    private Integer status;

    /**
     * 发布时间
     */
    private Date releaseDate;

    /**
     * 特殊字段
     */
    private String extJson;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}