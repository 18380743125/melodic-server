package com.tangl.auth.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthUserRoleBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 8179360509477339841L;

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

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;
}