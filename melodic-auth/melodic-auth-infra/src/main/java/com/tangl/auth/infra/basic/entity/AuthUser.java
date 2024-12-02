package com.tangl.auth.infra.basic.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信息表(AuthUser)实体类
 */
@TableName(value ="auth_user")
@Data
public class AuthUser implements Serializable {

    @Serial
    private static final long serialVersionUID = -5281876645463030584L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名称/账号
     */
    @TableField(value = "user_name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String nickName;

    /**
     * 邮箱
     */
    @TableField(value = "email", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "phone", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String phone;

    /**
     * 密码
     */
    @TableField(value = "password", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String password;

    /**
     * 性别
     */
    @TableField(value = "gender", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer gender;

    /**
     * 头像
     */
    @TableField(value = "avatar", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String avatar;

    /**
     * 状态 0启用 1禁用
     */
    @TableField(value = "status", updateStrategy = FieldStrategy.NOT_NULL)
    private Integer status;

    /**
     * 个人介绍
     */
    @TableField(value = "introduce", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String introduce;

    /**
     * 特殊字段
     */
    @TableField(value = "ext_json", updateStrategy = FieldStrategy.NOT_EMPTY)
    private String extJson;

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