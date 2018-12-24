package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.BuyerService;
import com.lzf.code.babasport.repository.BuyerRepository;

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
public class BuyerServiceImpl implements BuyerService {
	private final BuyerRepository buyerRepository;

	@Autowired
	public BuyerServiceImpl(BuyerRepository buyerRepository) {
		this.buyerRepository = buyerRepository;
	}

}
