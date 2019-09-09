package cn.iwangwei.springbootsecuritytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    public String testHome() {
        return "home test";
    }

    @GetMapping("/test")
    public String testTest() {
        return "test test";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
