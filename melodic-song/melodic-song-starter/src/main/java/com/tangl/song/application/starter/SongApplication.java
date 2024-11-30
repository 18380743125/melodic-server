package com.tangl.song.application.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tangl.song")
@ServletComponentScan("com.tangl.song")
@MapperScan("com.tangl.song.**.mapper")
public class SongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongApplication.class, args);
    }

}
