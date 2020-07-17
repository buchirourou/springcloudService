package com.shudaidai.web.controller;

import com.shudaidai.server.apis.TestServicesApis;
import com.shudaidai.server.controller.QureyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {
    //    使用依赖注入TestServicesApis，调用server的方法
    @Autowired
    private TestServicesApis testServicesApis;

    //获取config配置中心的配置类的值，$解析yml
    @Value("${myConfig.configVal}")
    private String value;

    @RequestMapping("/getTest")
    public String getTest() {
        return testServicesApis.getInfo();
    }

    @RequestMapping("/getValue1")
    public String getValue1() {
        return "hello word" + value;
    }
}
