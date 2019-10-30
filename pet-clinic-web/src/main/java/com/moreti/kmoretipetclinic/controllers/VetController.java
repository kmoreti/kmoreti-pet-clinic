package com.moreti.kmoretipetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VetController {

    @GetMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets() {

        return "vets/index";

    }
}
