package com.kimzing.news.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户信息保存
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Data
@Accessors(chain = true)
@ApiModel(value="用户信息保存", description="用户信息")
public class UserSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "积分")
    private String score;

}
