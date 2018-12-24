package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.ProvinceService;
import com.lzf.code.babasport.repository.ProvinceRepository;

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
public class ProvinceServiceImpl implements ProvinceService {
	private final ProvinceRepository provinceRepository;

	@Autowired
	public ProvinceServiceImpl(ProvinceRepository provinceRepository) {
		this.provinceRepository = provinceRepository;
	}

}
