package com.mk.xebia.solid;

import com.mk.xebia.solid.controllers.HelloWorldController;

public class Main {
    public static void main(String[] args) {
     HelloWorldController helloWorldController = new HelloWorldController();
        System.out.println(helloWorldController.greet());
    }
}
