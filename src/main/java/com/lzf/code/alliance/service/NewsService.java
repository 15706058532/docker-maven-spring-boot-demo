package com.lzf.code.alliance.service;

import com.lzf.code.alliance.resp.NewsResp;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
public interface NewsService {
    /**
     * 查询全部新闻
     *
     * @return
     */
    List<NewsResp> findAll();
}
