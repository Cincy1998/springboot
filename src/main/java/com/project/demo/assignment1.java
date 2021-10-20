package com.project.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class assignment1 {
@RequestMapping("/hello")
    public String sayhello(){
        return "hello java spring boot";
    }

    @RequestMapping("/hi")
    public String hello(){
        return "hello java";
    }

}

