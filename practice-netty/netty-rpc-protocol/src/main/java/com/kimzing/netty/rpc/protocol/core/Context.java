package com.kimzing.netty.rpc.protocol.core;

import io.netty.util.concurrent.Promise;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Context {

    public static  final AtomicLong REQUEST_ID = new AtomicLong();

    public static final Map<Long, Promise> REQUEST_MAP = new ConcurrentHashMap<>();
}
