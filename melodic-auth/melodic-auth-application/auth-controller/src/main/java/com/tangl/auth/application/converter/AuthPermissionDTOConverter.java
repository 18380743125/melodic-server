package com.tangl.auth.application.converter;

import com.tangl.auth.application.dto.AuthPermissionDTO;
import com.tangl.auth.domain.entity.AuthPermissionBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthPermissionDTOConverter {

    AuthPermissionBO permissionDTO2PermissionBO(AuthPermissionDTO permissionDTO);

}
