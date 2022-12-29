package com.kimzing.netty.alive.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 15:11
 */
@Data
@AllArgsConstructor
public class User implements Serializable {

    private String username;
    private String email;
    private String sex;

}
