package com.kimzing.news.controller.user;


import com.kimzing.news.domain.user.*;
import com.kimzing.news.service.user.UserService;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import com.kimzing.web.resolver.json.JsonParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息接口层.
 *
 * @author KimZing
 * @since 2021-03-16
 */
@Api(tags = "用户信息")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "保存用户信息")
    @PostMapping
    public UserBO save(@RequestBody UserSaveDTO userSaveDTO) {
        return userService.save(userSaveDTO);
    }

    @ApiOperation(value = "移除用户信息")
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Integer id) {
        userService.remove(id);
    }

    @ApiOperation(value = "更新用户信息")
    @PutMapping
    public void update(@RequestBody UserUpdateDTO userUpdateDTO) {
        userService.update(userUpdateDTO);
    }

    @ApiOperation(value = "查询单个用户信息")
    @GetMapping("/{id}")
    public UserBO get(@PathVariable("id") Integer id) {
        return userService.get(id);
    }

    @ApiOperation(value = "分页条件查询用户信息")
    @GetMapping("/list")
    public PageResult<UserBO> listPage(@JsonParam(required = false) UserQueryDTO userQueryDTO, @ModelAttribute PageParam pageParam) {
        return userService.listPage(userQueryDTO, pageParam);
    }

    @ApiOperation(value = "关注或取消关注作者")
    @GetMapping("/follow")
    public void followAuthor(@RequestParam Integer userId, @RequestParam Integer authorId) {
        userService.followAuthor(userId, authorId);
    }

    @ApiOperation("获取关注的作者集合")
    @GetMapping("/follow/authors")
    public List<UserBO> getFollowAuthorList(@RequestParam Integer userId) {
        return userService.getFollowAuthorList(userId);
    }

}
