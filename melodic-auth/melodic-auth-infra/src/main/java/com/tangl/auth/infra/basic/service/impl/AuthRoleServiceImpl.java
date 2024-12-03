package com.tangl.auth.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.auth.infra.basic.entity.AuthRole;
import com.tangl.auth.infra.basic.service.AuthRoleService;
import com.tangl.auth.infra.basic.mapper.AuthRoleMapper;
import org.springframework.stereotype.Service;

/**
 * 用户角色表(AuthRole)表服务实现类
 */
@Service
public class AuthRoleServiceImpl extends ServiceImpl<AuthRoleMapper, AuthRole>
    implements AuthRoleService{

}
