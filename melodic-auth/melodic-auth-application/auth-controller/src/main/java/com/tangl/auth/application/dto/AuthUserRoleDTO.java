package com.tangl.auth.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthUserRoleDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6432316718255006342L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;
}