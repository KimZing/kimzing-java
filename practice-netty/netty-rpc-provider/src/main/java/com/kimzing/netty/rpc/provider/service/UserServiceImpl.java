package com.kimzing.netty.rpc.provider.service;

import com.kimzing.netty.rpc.api.user.IUserService;
import com.kimzing.netty.rpc.protocol.annotation.GpRemoteService;

@GpRemoteService
public class UserServiceImpl implements IUserService {

    @Override
    public String saveUser(String name) {
        return name;
    }
}
