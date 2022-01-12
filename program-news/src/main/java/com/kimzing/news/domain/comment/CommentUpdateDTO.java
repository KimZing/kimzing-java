package com.kimzing.news.domain.comment;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 评论信息更新
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Data
@Accessors(chain = true)
@ApiModel(value="评论信息更新", description="评论信息")
public class CommentUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论信息ID")
    private Integer id;

    @ApiModelProperty(value = "文章ID")
    private Integer articleId;

    @ApiModelProperty(value = "评论人ID")
    private Integer userId;

    @ApiModelProperty(value = "评论内容")
    private String content;

}
