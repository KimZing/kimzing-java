package com.kimzing.news.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传下载.
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Api(tags = "上传下载")
@RestController
@RequestMapping("/common")
public class CommonController {

    @ApiOperation(value = "上传文件")
    @PostMapping("/upload")
    public void save(@RequestParam("file") MultipartFile file, @RequestParam String content) {
        System.out.println(String.format("文件名:[%s], 评论内容:[%s]", file.getOriginalFilename(), content));
    }

}
