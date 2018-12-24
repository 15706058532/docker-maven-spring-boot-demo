package com.lzf.code.alliance.service.impl;

import com.lzf.code.alliance.entity.News;
import com.lzf.code.alliance.resp.NewsResp;
import com.lzf.code.alliance.service.NewsService;
import com.lzf.code.alliance.repository.NewsRepository;

import com.lzf.code.common.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsResp> findAll() {
        List<News> newsList = newsRepository.findAll();
        BeanMapper beanMapper = new BeanMapper();
        return beanMapper.mapList(newsList,NewsResp.class);
    }
}
