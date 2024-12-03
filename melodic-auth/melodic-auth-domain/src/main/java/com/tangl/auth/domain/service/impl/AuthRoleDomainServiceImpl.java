package com.tangl.auth.domain.service.impl;

import com.tangl.auth.common.enums.IsDeletedFlagEnum;
import com.tangl.auth.common.exception.MelodicBusinessException;
import com.tangl.auth.domain.converter.AuthRoleBOConverter;
import com.tangl.auth.domain.entity.AuthRoleBO;
import com.tangl.auth.domain.service.AuthRoleDomainService;
import com.tangl.auth.infra.basic.entity.AuthRole;
import com.tangl.auth.infra.basic.service.AuthRoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AuthRoleDomainServiceImpl implements AuthRoleDomainService {

    @Resource
    private AuthRoleService roleService;

    @Resource
    private AuthRoleBOConverter roleBOConverter;

    @Override
    public void add(AuthRoleBO roleBO) {
        roleBO.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        AuthRole role = roleBOConverter.roleBO2Role(roleBO);
        if (!roleService.save(role)) {
            throw new MelodicBusinessException("新增角色失败");
        }
    }

    @Override
    public void update(AuthRoleBO roleBO) {
        AuthRole role = roleBOConverter.roleBO2Role(roleBO);
        if (!roleService.updateById(role)) {
            throw new MelodicBusinessException("更新角色失败");
        }
    }

    @Override
    public void delete(AuthRoleBO roleBO) {
        roleBO.setIsDeleted(IsDeletedFlagEnum.DELETED.getCode());
        AuthRole role = roleBOConverter.roleBO2Role(roleBO);
        if (!roleService.updateById(role)) {
            throw new MelodicBusinessException("删除角色失败");
        }
    }
}
