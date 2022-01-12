package com.kimzing.news.service.comment;

import com.kimzing.news.domain.comment.*;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import javax.validation.constraints.NotNull;

/**
 * 评论信息 服务接口
 *
 * @author KimZing
 * @since 2021-03-17
 */
public interface CommentService {

    /**
     * 保存评论信息
     */
    CommentBO save(CommentSaveDTO commentSaveDTO);

    /**
     * 移除评论信息
     */
    void remove(@NotNull(message = "COMMENT_1001") Integer id);

    /**
     * 更新评论信息
     */
    void update(CommentUpdateDTO commentUpdateDTO);

    /**
     * 查询单个评论信息
     */
    CommentBO get(@NotNull(message = "COMMENT_1001") Integer id);

    /**
     * 分页条件查询评论信息
     */
    PageResult<CommentBO> listPage(CommentQueryDTO commentQueryDTO, PageParam pageParam);
}
