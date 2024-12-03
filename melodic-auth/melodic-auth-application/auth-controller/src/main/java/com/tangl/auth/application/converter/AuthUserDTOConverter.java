package com.tangl.auth.application.converter;

import com.tangl.auth.application.dto.AuthUserDTO;
import com.tangl.auth.domain.entity.AuthUserBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthUserDTOConverter {

    AuthUserBO userDTO2UserBO(AuthUserDTO userDTO);

}
