package com.tangl.auth.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthRoleDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 5388837537149556834L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色唯一标识
     */
    private String roleKey;
}