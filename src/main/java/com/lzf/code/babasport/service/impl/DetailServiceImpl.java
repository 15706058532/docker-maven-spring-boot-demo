package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.DetailService;
import com.lzf.code.babasport.repository.DetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
@Service
public class DetailServiceImpl implements DetailService {
	private final DetailRepository detailRepository;

	@Autowired
	public DetailServiceImpl(DetailRepository detailRepository) {
		this.detailRepository = detailRepository;
	}

}
