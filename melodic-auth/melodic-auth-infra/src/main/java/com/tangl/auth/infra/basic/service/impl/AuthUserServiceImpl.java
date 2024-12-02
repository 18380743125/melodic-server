package com.tangl.auth.infra.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangl.auth.infra.basic.entity.AuthUser;
import com.tangl.auth.infra.basic.service.AuthUserService;
import com.tangl.auth.infra.basic.mapper.AuthUserMapper;
import org.springframework.stereotype.Service;

/**
 * 用户信息表(AuthUser)表服务实现类
 */
@Service
public class AuthUserServiceImpl extends ServiceImpl<AuthUserMapper, AuthUser>
        implements AuthUserService {

}




