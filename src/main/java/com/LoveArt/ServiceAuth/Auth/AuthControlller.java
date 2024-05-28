package com.LoveArt.ServiceAuth.Auth;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor

public class AuthControlller {
    @PostMapping(value = "login")
    public String login() {
        return "login de mi aplicacion";
    }

    @PostMapping(value = "register")
    public String register (){
        return "registro de usuarios";
    }
}
