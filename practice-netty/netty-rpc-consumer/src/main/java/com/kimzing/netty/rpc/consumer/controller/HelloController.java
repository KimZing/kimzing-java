package com.kimzing.netty.rpc.consumer.controller;

import com.kimzing.netty.rpc.api.user.IUserService;
import com.kimzing.netty.rpc.protocol.annotation.GpRemoteReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GpRemoteReference
    private IUserService iUserService;


    @RequestMapping("/say")
    public String say(){
        return iUserService.saveUser("涨薪6班");
    }
}
