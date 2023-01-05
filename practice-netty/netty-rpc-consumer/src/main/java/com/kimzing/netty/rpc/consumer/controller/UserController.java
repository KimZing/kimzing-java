package com.kimzing.netty.rpc.consumer.controller;

import com.kimzing.netty.rpc.api.user.User;
import com.kimzing.netty.rpc.api.user.UserService;
import com.kimzing.netty.rpc.protocol.annotation.KimReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @KimReference
    private UserService userService;


    @PostMapping
    public String save(@RequestBody User user){
        return userService.save(user);
    }
}
