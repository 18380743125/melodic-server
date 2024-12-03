package com.tangl.auth.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 角色权限关联表(AuthRolePermission)实体类
 */
@TableName(value = "auth_role_permission")
@Data
public class AuthRolePermission implements Serializable {

    @Serial
    private static final long serialVersionUID = -3397906648602041383L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 角色id
     */
    @TableField(value = "role_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long roleId;

    /**
     * 权限id
     */
    @TableField(value = "permission_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long permissionId;

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