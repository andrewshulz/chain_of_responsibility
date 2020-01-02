package com.example.chain_of_responsibility.service;

import com.example.chain_of_responsibility.service.send.SendService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Andrii Shulhin on 02.01.2020
 */
@Service
public class MainService {

    private Map<String, SendService> map;

    public MainService(List<SendService> sendServiceList){
        map = sendServiceList.stream().collect(Collectors.toMap(SendService::myCode, Function.identity()));
    }

    public String getMessage(String type){
        return "Send message with help "+map.get(type).getMessage();
    }
}
