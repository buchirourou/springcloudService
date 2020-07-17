package com.shudaidai.server.controller;

import com.shudaidai.server.service.QueryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qurey")
public class QureyController {
    @Autowired
    private QueryInfoService infoService;

    @RequestMapping("/getInfo")
    public String getInfo() {
        return infoService.getInfo();
    }
}
