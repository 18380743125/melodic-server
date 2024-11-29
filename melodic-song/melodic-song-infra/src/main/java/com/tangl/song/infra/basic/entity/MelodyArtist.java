package com.tangl.song.infra.basic.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 歌手信息表(MelodyArtist)实体类
 */
@Setter
@Getter
public class MelodyArtist implements Serializable {

    @Serial
    private static final long serialVersionUID = -82950191684986840L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 艺名
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 个人介绍
     */
    private String introduce;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 状态 0启用 1禁用
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否被删除 0未删除 1已删除
     */
    private Integer isDeleted;

}

