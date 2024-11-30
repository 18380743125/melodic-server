package com.tangl.song.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class SongGenreDTO implements Serializable {


    @Serial
    private static final long serialVersionUID = -5174539749188344876L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 流派名称（英文）
     */
    private String name;

    /**
     * 流派名称（中文）
     */
    private String remark;

    /**
     * 流派起源
     */
    private String origin;

    /**
     * 流派特点
     */
    private String feature;

    /**
     * 父级流派
     */
    private Long parentId;

}