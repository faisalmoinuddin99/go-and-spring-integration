package com.kakashi.reactivedemo.controller;

import com.kakashi.reactivedemo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestingController {

    @Autowired
    private ResponseService responseService ;
    @GetMapping
    public void jusDOIt(){
        responseService.getAllUserObject();
        responseService.getGoNetflixService();
    }
}
