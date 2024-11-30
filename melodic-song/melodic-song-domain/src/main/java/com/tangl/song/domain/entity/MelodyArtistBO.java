package com.tangl.song.domain.entity;

import com.tangl.song.common.entity.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MelodyArtistBO extends PageInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = -8114917911640464882L;

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
}
