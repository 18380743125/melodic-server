package com.tangl.auth.application.dto;

import com.tangl.auth.common.entity.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthUserDTO extends PageInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 9034782690654554119L;

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
}