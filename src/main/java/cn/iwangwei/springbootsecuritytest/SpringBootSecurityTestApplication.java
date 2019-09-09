package cn.iwangwei.springbootsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringBootSecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityTestApplication.class, args);
    }

}
