package com.tangl.song.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 歌曲流派表(SongGenre)实体类
 */
@TableName(value = "song_genre")
@Data
public class SongGenre implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 流派名称（英文）
     */
    @TableField(value = "name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    /**
     * 流派名称（中文）
     */
    @TableField(value = "remark", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String remark;

    /**
     * 流派起源
     */
    @TableField(value = "origin", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String origin;

    /**
     * 流派特点
     */
    @TableField(value = "feature", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String feature;

    /**
     * 父级流派
     */
    @TableField(value = "parent_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long parentId;

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

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
