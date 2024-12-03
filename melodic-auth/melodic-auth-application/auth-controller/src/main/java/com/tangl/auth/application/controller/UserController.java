package com.tangl.auth.application.controller;

import com.google.common.base.Preconditions;
import com.tangl.auth.application.converter.AuthUserDTOConverter;
import com.tangl.auth.application.dto.AuthUserDTO;
import com.tangl.auth.common.response.R;
import com.tangl.auth.domain.entity.AuthUserBO;
import com.tangl.auth.domain.service.AuthUserDomainService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private AuthUserDomainService userDomainService;

    @Resource
    private AuthUserDTOConverter userDTOConverter;

    @PostMapping("/add")
    public R<?> add(@RequestBody AuthUserDTO userDTO) {
        Preconditions.checkArgument(!StringUtils.isBlank(userDTO.getUserName()), "用户名不能为空");

        AuthUserBO userBO = userDTOConverter.userDTO2UserBO(userDTO);
        userDomainService.add(userBO);
        return R.success();
    }

    @PutMapping("/update")
    public R<?> update(@RequestBody AuthUserDTO userDTO) {
        Preconditions.checkNotNull(userDTO.getId(), "用户ID不能为空");

        AuthUserBO userBO = userDTOConverter.userDTO2UserBO(userDTO);
        userDomainService.update(userBO);
        return R.success();
    }

    @DeleteMapping("/delete")
    public R<?> delete(@RequestBody AuthUserDTO userDTO) {
        Preconditions.checkNotNull(userDTO.getId(), "用户ID不能为空");

        AuthUserBO userBO = userDTOConverter.userDTO2UserBO(userDTO);
        userDomainService.delete(userBO);
        return R.success();
    }

}
