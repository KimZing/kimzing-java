package com.kimzing.news.service.article.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kimzing.news.domain.article.*;
import com.kimzing.news.repository.article.ArticleMapper;
import com.kimzing.news.repository.article.ArticlePO;
import com.kimzing.news.repository.user.UserMapper;
import com.kimzing.news.service.article.ArticleService;
import com.kimzing.utils.bean.BeanUtil;
import com.kimzing.utils.page.PageParam;
import com.kimzing.utils.page.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static com.kimzing.utils.page.MPPageUtil.convertPage;
import static com.kimzing.utils.page.MPPageUtil.convertPageResult;

/**
 * 文章信息 服务实现类
 *
 * @author KimZing
 * @since 2021-03-04
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleMapper articleMapper;

    @Resource
    UserMapper userMapper;

    /**
     * 保存文章信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ArticleBO save(ArticleSaveDTO articleSaveDTO) {
        ArticlePO articlePO = BeanUtil.mapperBean(articleSaveDTO, ArticlePO.class);
        articleMapper.insert(articlePO);
        return BeanUtil.mapperBean(articlePO, ArticleBO.class);
    }

    /**
     * 移除文章信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void remove(Integer id) {
        articleMapper.delete(id);
    }

    /**
     * 更新文章信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ArticleUpdateDTO articleUpdateDTO) {
        ArticlePO articlePO = BeanUtil.mapperBean(articleUpdateDTO, ArticlePO.class);
        articleMapper.update(articlePO);
    }

    /**
     * 查询单个文章信息
     */
    @Override
    @Transactional(readOnly = true)
    public ArticleBO get(Integer id, Integer userId) {
        // MARK 这里省点事，不连表查了
        ArticleBO articleBO = articleMapper.selectById(id, userId);
        Integer count = userMapper.countFollowByAuthorIdAndUserId(userId, articleBO.getAuthorId());
        Boolean isFollow = count == null || count == 0 ? false : true;
        articleBO.setIsFollow(isFollow);
        return articleBO;
    }

    /**
     * 分页条件查询文章信息
     */
    @Override
    @Transactional(readOnly = true)
    public PageResult<ArticleBO> listPage(ArticleQueryDTO articleQueryDTO, PageParam pageParam) {
        IPage<ArticleBO> articleBOPage = articleMapper.selectPage(convertPage(pageParam), articleQueryDTO);
        return convertPageResult(articleBOPage);
    }

    /**
     * 根据关键词分页搜索文章信息
     *
     * @param search
     * @param userId
     * @param pageParam
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public PageResult<ArticleBO> searchWithPage(String search, Integer userId, PageParam pageParam) {
        IPage<ArticleBO> articleBOPage = articleMapper.selectPageByKeyword(convertPage(pageParam), search, userId);
        return convertPageResult(articleBOPage);
    }

    /**
     * 更改文章收藏状态
     *
     * @param articleLikeDTO
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateArticleLikeStatus(ArticleLikeDTO articleLikeDTO) {
        if (articleMapper.selectArticleLike(articleLikeDTO) != null) {
            articleMapper.removeArticleLike(articleLikeDTO);
            return;
        }
        articleMapper.addArticleLike(articleLikeDTO);
    }

    /**
     * 查询所有已收藏的文章
     *
     * @param userId
     * @param pageParam
     * @return
     */
    @Override
    public PageResult<ArticleBO> listLikeWithPage(Integer userId, PageParam pageParam) {
        IPage<ArticleBO> articleBOPage = articleMapper.selectPageOfAllLike(convertPage(pageParam), userId);
        return convertPageResult(articleBOPage);
    }


}
