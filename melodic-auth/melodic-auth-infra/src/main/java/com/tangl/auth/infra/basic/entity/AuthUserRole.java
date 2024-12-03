package com.tangl.auth.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户角色关联表(AuthUserRole)实体类
 */
@TableName(value = "auth_user_role")
@Data
public class AuthUserRole implements Serializable {

    @Serial
    private static final long serialVersionUID = -2187033194445590088L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long userId;

    /**
     * 角色id
     */
    @TableField(value = "role_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long roleId;

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