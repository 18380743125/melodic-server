package com.tangl.auth.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthRoleBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2542451089188768931L;

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

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;
}