package com.shudaidai.server.service.impl;


import com.shudaidai.server.service.QueryInfoService;
import org.springframework.stereotype.Service;

@Service
public class QueryInfoServiceImpl implements QueryInfoService {
    @Override
    public String getInfo() {
        return "hello world!";
    }
}
