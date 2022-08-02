package com.vasyl.spring.pet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vasyl
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
