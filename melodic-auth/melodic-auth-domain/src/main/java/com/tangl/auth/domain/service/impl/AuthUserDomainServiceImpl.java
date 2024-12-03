package com.tangl.auth.domain.service.impl;

import com.tangl.auth.common.enums.IsDeletedFlagEnum;
import com.tangl.auth.common.exception.MelodicBusinessException;
import com.tangl.auth.domain.converter.AuthUserBOConverter;
import com.tangl.auth.domain.entity.AuthUserBO;
import com.tangl.auth.domain.service.AuthUserDomainService;
import com.tangl.auth.infra.basic.entity.AuthUser;
import com.tangl.auth.infra.basic.service.AuthUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDomainServiceImpl implements AuthUserDomainService {

    @Resource
    private AuthUserService userService;

    @Resource
    private AuthUserBOConverter userBOConverter;

    @Override
    public void add(AuthUserBO userBO) {
        userBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        AuthUser user = userBOConverter.userBO2User(userBO);
        if (!userService.save(user)) {
            throw new MelodicBusinessException("新增用户失败");
        }
    }

    @Override
    public void update(AuthUserBO userBO) {
        AuthUser user = userBOConverter.userBO2User(userBO);
        if (!userService.updateById(user)) {
            throw new MelodicBusinessException("更新用户失败");
        }
    }

    @Override
    public void delete(AuthUserBO userBO) {
        userBO.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        AuthUser user = userBOConverter.userBO2User(userBO);
        if (!userService.updateById(user)) {
            throw new MelodicBusinessException("删除用户失败");
        }
    }
}
