package com.tangl.song.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tangl.song")
public class SongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongApplication.class, args);
    }

}
