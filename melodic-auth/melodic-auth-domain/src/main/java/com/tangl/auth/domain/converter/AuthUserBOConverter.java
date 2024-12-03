package com.tangl.auth.domain.converter;

import com.tangl.auth.domain.entity.AuthUserBO;
import com.tangl.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthUserBOConverter {

    AuthUser userBO2User(AuthUserBO userBO);

}
