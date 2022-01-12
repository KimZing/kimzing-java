package com.kimzing.news.service.user;

import com.kimzing.news.domain.user.*;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 用户信息 服务接口
 *
 * @author KimZing
 * @since 2021-03-16
 */
public interface UserService {

    /**
     * 保存用户信息
     */
    UserBO save(UserSaveDTO userSaveDTO);

    /**
     * 移除用户信息
     */
    void remove(@NotNull(message = "USER_1001") Integer id);

    /**
     * 更新用户信息
     */
    void update(UserUpdateDTO userUpdateDTO);

    /**
     * 查询单个用户信息
     */
    UserBO get(@NotNull(message = "USER_1001") Integer id);

    /**
     * 分页条件查询用户信息
     */
    PageResult<UserBO> listPage(UserQueryDTO userQueryDTO, PageParam pageParam);

    /**
     * 关注或取消关注作者
     * @param userId
     * @param authorId
     */
    void followAuthor(Integer userId, Integer authorId);

    /**
     * 获取关注的作者集合
     * @param userId
     * @return
     */
    List<UserBO> getFollowAuthorList(Integer userId);
}
