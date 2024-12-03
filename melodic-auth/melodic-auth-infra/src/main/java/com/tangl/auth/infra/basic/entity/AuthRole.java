package com.tangl.auth.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色信息表(AuthRole)实体类
 */
@TableName(value = "auth_role")
@Data
public class AuthRole implements Serializable {

    @Serial
    private static final long serialVersionUID = 6214933367825460198L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 角色名称
     */
    @TableField(value = "role_name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String roleName;

    /**
     * 角色唯一标识
     */
    @TableField(value = "role_key", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String roleKey;

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