package com.telas.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexTelas {
     @RequestMapping("/")
    public String index(){
        return"index";
    }

    @RequestMapping("/formulario")
    public String formulario(){
        return"formulario";
    }

}
