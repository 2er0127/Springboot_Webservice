package com.seonaweb.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { // 메인 클래스
    public static void main(String[] args) {
        // 내장 WAS: [언제어디서나 같은 환경에서 스프링부트 배포 가능]
        SpringApplication.run(Application.class, args);
    }
}
