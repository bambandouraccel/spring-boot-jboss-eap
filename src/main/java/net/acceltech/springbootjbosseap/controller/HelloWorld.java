package net.acceltech.springbootjbosseap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class HelloWorld {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World!, from JBoss EAP8 Server.";
    }
}
