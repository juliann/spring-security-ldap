package com.nadarzy.springsecurityldap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Julian Nadarzy on 17/09/2021
 */
@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
    return "home page";
    }

}
