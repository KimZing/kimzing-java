package com.kimzing.news.service.user.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kimzing.news.domain.user.*;
import com.kimzing.news.repository.user.UserMapper;
import com.kimzing.news.repository.user.UserPO;
import com.kimzing.news.service.user.UserService;
import com.kimzing.utils.bean.BeanUtil;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;

import static com.kimzing.utils.page.MPPageUtil.convertPage;
import static com.kimzing.utils.page.MPPageUtil.convertPageResult;

/**
 * 用户信息 服务实现类
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 保存用户信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserBO save(UserSaveDTO userSaveDTO) {
        UserPO userPO = BeanUtil.mapperBean(userSaveDTO, UserPO.class);
        userMapper.insert(userPO);
        return BeanUtil.mapperBean(userPO, UserBO.class);
    }

    /**
     * 移除用户信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void remove(Integer id) {
        userMapper.delete(id);
    }

    /**
     * 更新用户信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(UserUpdateDTO userUpdateDTO) {
        UserPO userPO = BeanUtil.mapperBean(userUpdateDTO, UserPO.class);
        userMapper.update(userPO);
    }

    /**
     * 查询单个用户信息
     */
    @Override
    public UserBO get(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 分页条件查询用户信息
     */
    @Override
    @Transactional(readOnly = true)
    public PageResult<UserBO> listPage(UserQueryDTO userQueryDTO, PageParam pageParam) {
        IPage<UserBO> userBOPage = userMapper.selectPage(convertPage(pageParam), userQueryDTO);
        return convertPageResult(userBOPage);
    }

    /**
     * 关注或取消关注作者
     * @param userId
     * @param authorId
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void followAuthor(Integer userId, Integer authorId) {
        Integer count = userMapper.countFollowByAuthorIdAndUserId(userId, authorId);
        if (count >= 1) {
            userMapper.removeFollow(userId, authorId);
            return;
        }
        userMapper.addFollow(userId, authorId);
    }

    /**
     * 获取关注的作者集合
     * @param userId
     * @return
     */
    @Override
    public List<UserBO> getFollowAuthorList(Integer userId) {
        return userMapper.getFollowAuthorList(userId);
    }

}
