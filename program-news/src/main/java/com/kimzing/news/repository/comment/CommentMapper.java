package com.kimzing.news.repository.comment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kimzing.news.domain.comment.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 评论信息 Mapper 接口
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Mapper
public interface CommentMapper {

    /**
     * 保存评论信息
     */
    Integer insert(CommentPO commentPO);

    /**
     * 批量保存评论信息
     */
    void insertBatch(List<CommentPO> list);

    /**
     * 删除评论信息
     */
    void delete(Integer id);

    /**
     * 根据ID更新评论信息
     */
    void update(CommentPO commentPO);

    /**
     * 根据ID查询评论信息
     */
    CommentBO selectById(Integer id);

    /**
     * 条件分页查询评论信息
     */
    IPage<CommentBO> selectPage(Page<CommentBO> page, @Param("query") CommentQueryDTO commentQueryDTO);

}
