package com.tangl.song.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 歌手信息表(MelodyArtist)实体类
 */
@Setter
@Getter
public class MelodyArtist implements Serializable {

    @Serial
    private static final long serialVersionUID = -82950191684986840L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 艺名
     */
    @TableField(value = "name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    /**
     * 性别
     */
    @TableField(value = "gender", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer gender;

    /**
     * 出生日期
     */
    @TableField(value = "birthday", updateStrategy = FieldStrategy.NOT_NULL)
    private Date birthday;

    /**
     * 国籍
     */
    @TableField(value = "nationality", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String nationality;

    /**
     * 个人介绍
     */
    @TableField(value = "introduce", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String introduce;

    /**
     * 头像
     */
    @TableField(value = "avatar", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String avatar;

    /**
     * 粉丝数量
     */
    @TableField(value = "fans_count", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer fansCount;

    /**
     * 状态 0启用 1禁用
     */
    @TableField(value = "status", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer status;

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

