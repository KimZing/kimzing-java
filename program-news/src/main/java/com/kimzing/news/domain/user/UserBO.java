package com.kimzing.news.domain.user;

import com.kimzing.utils.po.AbstractBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户信息业务对象
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="用户信息业务对象", description="用户信息")
public class UserBO extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "文章数量")
    private Integer articleCount;

    @ApiModelProperty(value = "关注数")
    private Integer followCount;

    @ApiModelProperty(value = "粉丝数量")
    private Integer fansCount;

    @ApiModelProperty(value = "积分")
    private Integer score;

    @ApiModelProperty(value = "是否可用")
    private Integer deleted;

}
