package com.tangl.song.application.dto;

import com.tangl.song.common.entity.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class SongInfoDTO extends PageInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 2853979810723028917L;
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
    private String releaseDate;

    /**
     * 特殊字段
     */
    private String extJson;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}