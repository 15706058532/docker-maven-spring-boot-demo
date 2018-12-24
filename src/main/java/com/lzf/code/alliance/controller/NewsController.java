package com.lzf.code.alliance.controller;

import com.lzf.code.alliance.resp.NewsResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.alliance.service.NewsService;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/news")
public class NewsController {
	private final NewsService newsService;

	@Autowired
	public NewsController(NewsService newsService) {
		this.newsService = newsService;
	}
	@GetMapping("/find/all")
	public List<NewsResp> findAll(){
		return newsService.findAll();
	}

}
