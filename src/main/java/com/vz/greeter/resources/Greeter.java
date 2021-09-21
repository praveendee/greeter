package com.vz.greeter.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Greeter {

    @GetMapping("greet/{name}")
    public String greet(@PathVariable String name){
        if(name==null){
            name = "there";
        }
        return "Hello "+name+"!!!";
    }
}
