package com.kimzing.news.repository.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kimzing.news.domain.user.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户信息 Mapper 接口
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Mapper
public interface UserMapper {

    /**
     * 保存用户信息
     */
    Integer insert(UserPO userPO);

    /**
     * 批量保存用户信息
     */
    void insertBatch(List<UserPO> list);

    /**
     * 删除用户信息
     */
    void delete(Integer id);

    /**
     * 根据ID更新用户信息
     */
    void update(UserPO userPO);

    /**
     * 根据ID查询用户信息
     */
    UserBO selectById(Integer id);

    /**
     * 条件分页查询用户信息
     */
    IPage<UserBO> selectPage(Page<UserBO> page, @Param("query") UserQueryDTO userQueryDTO);

    /**
     * 查询是否关注
     * @param userId
     * @param authorId
     * @return
     */
    Integer countFollowByAuthorIdAndUserId(@Param("userId") Integer userId, @Param("authorId") Integer authorId);

    /**
     * 查询作者的关注人数
     * @param authorId
     * @return
     */
    Integer countFansByAuthorId(@Param("authorId") Integer authorId);

    /**
     * 查询当前用户关注了多少个作者
     * @param userId
     * @return
     */
    Integer countFollowAuthorByUserId(@Param("userId") Integer userId);

    /**
     * 移除关注
     * @param userId
     * @param authorId
     */
    void removeFollow(@Param("userId") Integer userId, @Param("authorId") Integer authorId);

    /**
     * 添加关注
     * @param userId
     * @param authorId
     */
    void addFollow(@Param("userId") Integer userId, @Param("authorId") Integer authorId);

    /**
     * 获取关注作者集合
     * @param userId
     * @return
     */
    List<UserBO> getFollowAuthorList(Integer userId);
}
