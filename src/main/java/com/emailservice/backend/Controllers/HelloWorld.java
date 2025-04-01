package com.emailservice.backend.Controllers;

import com.emailservice.backend.Models.Child;
import com.emailservice.backend.Service.ChildService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorld {

    private ChildService childservice;

    //
    public HelloWorld(ChildService childservice) {
        this.childservice = childservice;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/child")
    public List<Child> getChild() {
        return childservice.getChild();
    }

}
