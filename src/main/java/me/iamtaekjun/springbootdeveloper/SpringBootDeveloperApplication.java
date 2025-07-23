package me.iamtaekjun.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing // created_at, updated_at 자동 업데이트
@SpringBootApplication
@EntityScan("me.iamtaekjun.springbootdeveloper.domain")
@EnableJpaRepositories("me.iamtaekjun.springbootdeveloper.repository")
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}