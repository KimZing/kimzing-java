package com.kimzing.news.service.comment.impl;

import com.kimzing.news.repository.comment.CommentMapper;
import com.kimzing.news.service.comment.CommentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kimzing.news.repository.comment.CommentPO;
import com.kimzing.news.domain.comment.*;
import com.kimzing.utils.bean.BeanUtil;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import static com.kimzing.utils.page.MPPageUtil.convertPage;
import static com.kimzing.utils.page.MPPageUtil.convertPageResult;

import javax.annotation.Resource;

/**
 * 评论信息 服务实现类
 *
 * @author KimZing
 * @since 2021-03-17
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;

    /**
     * 保存评论信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public CommentBO save(CommentSaveDTO commentSaveDTO) {
        CommentPO commentPO = BeanUtil.mapperBean(commentSaveDTO, CommentPO.class);
        commentMapper.insert(commentPO);
        return BeanUtil.mapperBean(commentPO, CommentBO.class);
    }

    /**
     * 移除评论信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void remove(Integer id) {
        commentMapper.delete(id);
    }

    /**
     * 更新评论信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(CommentUpdateDTO commentUpdateDTO) {
        CommentPO commentPO = BeanUtil.mapperBean(commentUpdateDTO, CommentPO.class);
        commentMapper.update(commentPO);
    }

    /**
     * 查询单个评论信息
     */
    @Override
    public CommentBO get(Integer id) {
        return commentMapper.selectById(id);
    }

    /**
     * 分页条件查询评论信息
     */
    @Override
    @Transactional(readOnly = true)
    public PageResult<CommentBO> listPage(CommentQueryDTO commentQueryDTO, PageParam pageParam) {
        IPage<CommentBO> commentBOPage = commentMapper.selectPage(convertPage(pageParam), commentQueryDTO);
        return convertPageResult(commentBOPage);
    }

}
