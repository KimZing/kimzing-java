package com.kimzing.netty.rpc.provider.service;

import com.kimzing.netty.rpc.api.user.User;
import com.kimzing.netty.rpc.api.user.UserService;
import com.kimzing.netty.rpc.protocol.annotation.KimService;

@KimService
public class UserServiceImpl implements UserService {

    @Override
    public String save(User user) {
        return "保存成功:" + user.getName();
    }
}
