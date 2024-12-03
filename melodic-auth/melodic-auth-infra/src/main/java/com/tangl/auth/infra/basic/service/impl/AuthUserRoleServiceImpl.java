package com.tangl.auth.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.auth.infra.basic.entity.AuthUserRole;
import com.tangl.auth.infra.basic.service.AuthUserRoleService;
import com.tangl.auth.infra.basic.mapper.AuthUserRoleMapper;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联表(AuthUserRole)表服务实现类
 */
@Service
public class AuthUserRoleServiceImpl extends ServiceImpl<AuthUserRoleMapper, AuthUserRole>
    implements AuthUserRoleService{

}
