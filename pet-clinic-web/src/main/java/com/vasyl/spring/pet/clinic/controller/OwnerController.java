package com.vasyl.spring.pet.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vasyl
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
