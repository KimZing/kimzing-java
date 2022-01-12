package com.kimzing.news.domain.article;

import com.kimzing.news.domain.user.UserBO;
import com.kimzing.utils.po.AbstractBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 文章信息业务对象
 *
 * @author KimZing
 * @since 2021-03-04
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="文章信息业务对象", description="文章信息")
public class ArticleBO extends AbstractBO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "作者信息")
    private UserBO author;

    @ApiModelProperty(value = "作者ID")
    private Integer authorId;

    @ApiModelProperty(value = "文章标题")
    private String title;

    @ApiModelProperty(value = "文章内容")
    private String content;

    @ApiModelProperty(value = "文章图片")
    private String images;

    @ApiModelProperty(value = "分类信息")
    private String classify;

    @ApiModelProperty(value = "卡片模式")
    private String mode;

    @ApiModelProperty(value = "是否收藏")
    private Boolean isLike = false;

    @ApiModelProperty(value = "是否关注了该文章的作者")
    private Boolean isFollow = false;

    @ApiModelProperty(value = "阅读量")
    private Integer readCount;

}
