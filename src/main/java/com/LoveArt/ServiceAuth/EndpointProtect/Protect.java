package com.LoveArt.ServiceAuth.EndpointProtect;

import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class Protect {
    @PostMapping(value = "protect")
    public String welcome (){
        return "welcome form secure endpoint";
    }
}
