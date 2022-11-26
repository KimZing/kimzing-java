package com.kimzing.netty.serializer.base.entity;

import com.kimzing.netty.serializer.base.enums.LanguageEnum;
import com.kimzing.netty.serializer.base.enums.ReqTypeEnum;
import com.kimzing.netty.serializer.base.enums.SerializerTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/22 14:57
 */
@Data
public class Header implements Serializable {

    public Header(int version, LanguageEnum language, ReqTypeEnum reqType) {
        this.version = version;
        this.language = language;
        this.reqType = reqType;
    }

    /** 版本 */
    private int version;
    /** 语言 */
    private LanguageEnum language;
    /** 序列化方式 */
    private SerializerTypeEnum serializer;
    /** 请求类型 */
    private ReqTypeEnum reqType;

}
