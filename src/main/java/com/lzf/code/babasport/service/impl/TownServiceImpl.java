package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.TownService;
import com.lzf.code.babasport.repository.TownRepository;

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
public class TownServiceImpl implements TownService {
	private final TownRepository townRepository;

	@Autowired
	public TownServiceImpl(TownRepository townRepository) {
		this.townRepository = townRepository;
	}

}
