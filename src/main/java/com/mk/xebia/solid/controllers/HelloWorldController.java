package com.mk.xebia.solid.controllers;

import com.mk.xebia.solid.services.HelloWorldService;
public class HelloWorldController {

    private HelloWorldService helloWorldService = new HelloWorldService();

    public String greet(){
        return "The message is :: " + this.helloWorldService.getMessage();
    }
}
