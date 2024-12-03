package com.tangl.auth.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthRolePermissionDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2245547892315245350L;

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
}