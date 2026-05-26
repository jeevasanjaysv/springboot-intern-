package com.eduhub.eduhub_backed.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private  final Environment environment;
    @Value("${spring.application.name}")
    private  String appname;

    public  HelloWorldController(Environment env){
        this.environment=env;
    }


    @GetMapping("/env")
    public  String getEnvironmentVariable(){
        String port =environment.getProperty("server.port");
        return  "Appname:"+appname+" port:"+port;
    }

    @GetMapping("hello")
    public  String helloworld(){
        return "Hello World!!!";
    }
}
