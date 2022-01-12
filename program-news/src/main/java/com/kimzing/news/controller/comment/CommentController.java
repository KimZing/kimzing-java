package com.kimzing.news.controller.comment;


import com.kimzing.news.domain.comment.CommentBO;
import com.kimzing.news.domain.comment.CommentQueryDTO;
import com.kimzing.news.domain.comment.CommentSaveDTO;
import com.kimzing.news.domain.comment.CommentUpdateDTO;
import com.kimzing.news.service.comment.CommentService;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 评论信息接口层.
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Api(tags = "评论信息")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    CommentService commentService;

    @ApiOperation(value = "保存评论信息")
    @PostMapping
    public CommentBO save(@RequestBody CommentSaveDTO commentSaveDTO) {
        return commentService.save(commentSaveDTO);
    }

    @ApiOperation(value = "移除评论信息")
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Integer id) {
        commentService.remove(id);
    }

    @ApiOperation(value = "更新评论信息")
    @PutMapping
    public void update(@RequestBody CommentUpdateDTO commentUpdateDTO) {
        commentService.update(commentUpdateDTO);
    }

    @ApiOperation(value = "查询单个评论信息")
    @GetMapping("/{id}")
    public CommentBO get(@PathVariable("id") Integer id) {
        return commentService.get(id);
    }

    @ApiOperation(value = "分页条件查询评论信息")
    @PostMapping("/list")
    public PageResult<CommentBO> listPage(@RequestBody CommentQueryDTO commentQueryDTO, @ModelAttribute PageParam pageParam) {
        return commentService.listPage(commentQueryDTO, pageParam);
    }

}
