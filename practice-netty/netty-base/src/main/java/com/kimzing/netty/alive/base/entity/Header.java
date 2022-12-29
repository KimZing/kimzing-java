package com.kimzing.netty.alive.base.entity;

import com.kimzing.netty.alive.base.enums.LanguageEnum;
import com.kimzing.netty.alive.base.enums.ReqTypeEnum;
import com.kimzing.netty.alive.base.enums.SerializableEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 14:57
 */
@Data
@AllArgsConstructor
public class Header implements Serializable {

    /** 版本 */
    private int version;
    /** 语言 */
    private LanguageEnum language;
    /** 序列化方式 */
    private SerializableEnum serializable;
    /** 请求类型 */
    private ReqTypeEnum reqType;

}
