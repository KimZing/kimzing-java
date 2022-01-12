package com.kimzing.news.domain.comment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 评论信息查询
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Data
@Accessors(chain = true)
@ApiModel(value="评论信息查询", description="评论信息")
public class CommentQueryDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "文章ID")
    private Integer articleId;

}
