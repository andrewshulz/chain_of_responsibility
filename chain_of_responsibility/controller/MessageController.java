package com.example.chain_of_responsibility.controller;

import com.example.chain_of_responsibility.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrii Shulhin on 02.01.2020
 */
@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String sendMessage(@RequestParam String type){
        return mainService.getMessage(type);
    }

}
