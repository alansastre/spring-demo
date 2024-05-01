package com.certidevs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

record Hello(String message) {}

@RestController
@SpringBootApplication
public class SpringDemoApplication {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("hello")
    public String create(@RequestBody Hello hello) {
        return hello.message();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
