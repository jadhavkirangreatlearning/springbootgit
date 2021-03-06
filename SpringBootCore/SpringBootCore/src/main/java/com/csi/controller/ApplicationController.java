package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO CSI PUNE";
    }
    @GetMapping("/services")
    public String services(){
        return "SOFTWARE DEVELOPMENT";
    }
    @GetMapping("/address")
    public String address(){
        return "INSPIRIA MALL | PUNE";
    }

    @GetMapping("/products")
    public String productServices(){
        return "QR CODE SOLUTIONS";
    }

}
