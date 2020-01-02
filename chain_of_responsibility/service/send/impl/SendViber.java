package com.example.chain_of_responsibility.service.send.impl;

import com.example.chain_of_responsibility.service.send.SendService;
import org.springframework.stereotype.Service;

import static com.example.chain_of_responsibility.util.MyTypes.VIBER;

/**
 * Created by Andrii Shulhin on 02.01.2020
 */
@Service
public class SendViber implements SendService {

    @Override
    public String getMessage() {
        return "Viber";
    }

    @Override
    public String myCode() {
        return VIBER;
    }
}
