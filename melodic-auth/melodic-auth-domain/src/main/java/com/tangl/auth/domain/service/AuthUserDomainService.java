package com.tangl.auth.domain.service;

import com.tangl.auth.domain.entity.AuthUserBO;

public interface AuthUserDomainService {

    /**
     * 新增用户
     */
    void add(AuthUserBO userBO);

    /**
     * 更新用户
     */
    void update(AuthUserBO userBO);

    /**
     * 删除用户
     */
    void delete(AuthUserBO userBO);
}
