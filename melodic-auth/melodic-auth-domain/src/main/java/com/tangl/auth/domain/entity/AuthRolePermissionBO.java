package com.tangl.auth.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthRolePermissionBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1425835849064759012L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限id
     */
    private Long permissionId;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;
}