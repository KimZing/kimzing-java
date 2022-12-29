package com.kimzing.netty.protobuf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public
class Header {
    long version;
    byte language;
    byte serializer;
    byte reqType;
}