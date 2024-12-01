package com.tangl.song.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 歌曲信息表(SongInfo)实体类
 */
@TableName(value = "song_info")
@Data
public class SongInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 8052906670942733809L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 歌曲名称
     */
    @TableField(value = "name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    /**
     * 专辑名称
     */
    @TableField(value = "album_name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String albumName;

    /**
     * 歌曲链接
     */
    @TableField(value = "song_url", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String songUrl;

    /**
     * 时长
     */
    @TableField(value = "duration", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer duration;

    /**
     * 封面
     */
    @TableField(value = "cover", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String cover;

    /**
     * 状态 0启用 1禁用
     */
    @TableField(value = "status", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer status;

    /**
     * 发布时间
     */
    @TableField(value = "release_date", updateStrategy = FieldStrategy.NOT_EMPTY)
    private Date releaseDate;

    /**
     * 特殊字段
     */
    @TableField(value = "ext_json", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String extJson;

    /**
     * 创建人
     */
    @TableField(value = "create_by", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", updateStrategy = FieldStrategy.NOT_NULL)
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private Date updateTime;

    /**
     * 是否被删除 0未删除 1已删除
     */
    @TableField(value = "is_deleted", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer isDeleted;

}