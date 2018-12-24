package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.ImgService;
import com.lzf.code.babasport.repository.ImgRepository;

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
public class ImgServiceImpl implements ImgService {
	private final ImgRepository imgRepository;

	@Autowired
	public ImgServiceImpl(ImgRepository imgRepository) {
		this.imgRepository = imgRepository;
	}

}
