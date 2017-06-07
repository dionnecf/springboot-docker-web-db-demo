package com.dionnecondorfarrell.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dionne on 27/05/2017.
 */
@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){

        return "<h1>Hi, Welcome to my ToDoList app running in Docker with Mysql... :)</h1>";
    }
}
