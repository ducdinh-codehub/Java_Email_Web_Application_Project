/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Duc
 */
@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Say hello");
        return "Hello";
    }
}
