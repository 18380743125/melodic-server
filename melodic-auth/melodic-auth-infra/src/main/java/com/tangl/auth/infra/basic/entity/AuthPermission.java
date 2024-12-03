package com.tangl.auth.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限表(AuthPermission)实体类
 */
@TableName(value = "auth_permission")
@Data
public class AuthPermission implements Serializable {

    @Serial
    private static final long serialVersionUID = -5456628004623842532L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 权限名称
     */
    @TableField(value = "name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    /**
     * 父级id
     */
    @TableField(value = "parent_id", updateStrategy = FieldStrategy.NOT_NULL)
    private Long parentId;

    /**
     * 权限类型 0-菜单 1-操作
     */
    @TableField(value = "type", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer type;

    /**
     * 菜单路由
     */
    @TableField(value = "menu_url", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String menuUrl;

    /**
     * 状态 0启用 1禁用
     */
    @TableField(value = "status", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer status;

    /**
     * 菜单展示状态 0展示 1隐藏（页面）
     */
    @TableField(value = "show", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer show;

    /**
     * 图标
     */
    @TableField(value = "icon", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String icon;

    /**
     * 权限唯一标识
     */
    @TableField(value = "permission_key", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String permissionKey;

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