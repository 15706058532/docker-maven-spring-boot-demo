package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.SkuService;
import com.lzf.code.babasport.repository.SkuRepository;

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
public class SkuServiceImpl implements SkuService {
	private final SkuRepository skuRepository;

	@Autowired
	public SkuServiceImpl(SkuRepository skuRepository) {
		this.skuRepository = skuRepository;
	}

}
