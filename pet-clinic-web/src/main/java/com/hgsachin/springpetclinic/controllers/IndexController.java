package com.hgsachin.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String invokeIndex() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oops() {
        return "notImplemented";
    }
}
