package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.AddrService;
import com.lzf.code.babasport.repository.AddrRepository;

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
public class AddrServiceImpl implements AddrService {
	private final AddrRepository addrRepository;

	@Autowired
	public AddrServiceImpl(AddrRepository addrRepository) {
		this.addrRepository = addrRepository;
	}

}
