package com.shudaidai.server.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server-service", contextId = "TestServicesApis")
public interface TestServicesApis {
    @RequestMapping("/qurey/getInfo")
     String getInfo();
}
