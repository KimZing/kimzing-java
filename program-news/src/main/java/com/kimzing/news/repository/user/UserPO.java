package com.kimzing.news.repository.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kimzing.utils.po.AbstractPO;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 用户信息实体
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class UserPO extends AbstractPO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 职位
     */
    @TableField("position")
    private String position;

    /**
     * 积分
     */
    @TableField("score")
    private Integer score;

}
