package com.lzf.code.alliance.service.impl;

import com.lzf.code.alliance.service.PromotionService;
import com.lzf.code.alliance.repository.PromotionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
@Service
public class PromotionServiceImpl implements PromotionService {
	private final PromotionRepository promotionRepository;

	@Autowired
	public PromotionServiceImpl(PromotionRepository promotionRepository) {
		this.promotionRepository = promotionRepository;
	}

}
