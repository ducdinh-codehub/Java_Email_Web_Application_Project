/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Duc
 */
@Controller
public class WebController {
    @Autowired private EmailSenderService senderService;
    @GetMapping(value="/message")
    public String sayHello(@ModelAttribute("form") SendingDTO formData, BindingResult 
result){
        System.out.println("Say hello");
        String acc = formData.getAcc();
        String cc = formData.getCc();
        String content = formData.getContent();
        if(acc != null && cc != null && content != null){
            senderService.sendEmail(acc, 
                                    cc, 
                                    content);
        }
        return "message";
    }
}
