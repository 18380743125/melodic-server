package com.tangl.auth.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthPermissionDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -3794786163004915404L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 父级id
     */
    private Long parentId;

    /**
     * 权限类型 0-菜单 1-操作
     */
    private Integer type;

    /**
     * 菜单路由
     */
    private String menuUrl;

    /**
     * 状态 0启用 1禁用
     */
    private Integer status;

    /**
     * 菜单展示状态 0展示 1隐藏（页面）
     */
    private Integer show;

    /**
     * 图标
     */
    private String icon;

    /**
     * 权限唯一标识
     */
    private String permissionKey;
}