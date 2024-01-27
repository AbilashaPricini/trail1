package com.example.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDemo {
    //localhost:9090/web
    @RequestMapping(method = RequestMethod.GET, value = "/web")
    public String SampleController(){
        System.out.println("Load index page");
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/some")
    //@ResponseBody
    public String someData(){
        return "somedata";
    }
}
