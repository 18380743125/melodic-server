package com.tangl.song.application.config;

import com.tangl.song.common.constants.SongConstants;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.HibernateValidator;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * 统一的参数校验器
 */
@SpringBootConfiguration
@Slf4j
public class WebValidatorConfig {

    private static final String FAIT_FAST_KEY = "hibernate.validator.fail_fast";

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        MethodValidationPostProcessor postProcessor = new MethodValidationPostProcessor();
        postProcessor.setValidator(validator());
        log.info("The hibernate validator is loaded successfully！");
        return postProcessor;
    }

    /**
     * 构造项目的方法校验器
     *
     * @return Validator
     */
    private Validator validator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .addProperty(FAIT_FAST_KEY, SongConstants.TRUE_STR)
                .buildValidatorFactory();
        return validatorFactory.getValidator();
    }
}
