package com.tangl.song.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class SongLyricBO implements Serializable {

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
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}