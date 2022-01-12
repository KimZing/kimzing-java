package com.kimzing.news.repository.comment;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kimzing.utils.po.AbstractPO;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 评论信息实体
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("comment")
public class CommentPO extends AbstractPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    @TableField("article_id")
    private Integer articleId;

    /**
     * 评论人ID
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 评论内容
     */
    @TableField("content")
    private String content;

}
