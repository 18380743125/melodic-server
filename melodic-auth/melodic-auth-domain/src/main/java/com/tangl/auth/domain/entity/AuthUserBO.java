package com.tangl.auth.domain.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class AuthUserBO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8362801119569800334L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名称/账号
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 状态 0启用 1禁用
     */
    private Integer status;

    /**
     * 个人介绍
     */
    private String introduce;

    /**
     * 特殊字段
     */
    private String extJson;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;
}