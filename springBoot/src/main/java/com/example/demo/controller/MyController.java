package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;

@RestController
public class MyController {
    
    Persona p = new Persona("Bobo", "Lasagni", "BOBLAS0017", 24);
    
    @GetMapping("/")
    public String index(){
        return "Hello SpringBoot";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello, %s!", name);
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return String.format("Hello, %s!", name);
    }


    @GetMapping("/persona")
    public Persona persona(){
        return p;
    }
}
