package com.kimzing.news.domain.comment;

import com.kimzing.news.domain.user.UserBO;
import com.kimzing.utils.po.AbstractBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 评论信息业务对象
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="评论信息业务对象", description="评论信息")
public class CommentBO extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "文章ID")
    private Integer articleId;

    @ApiModelProperty(value = "评论人ID")
    private Integer userId;

    @ApiModelProperty(value = "评论人")
    private UserBO commentUser;

    @ApiModelProperty(value = "评论内容")
    private String content;

}
