package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.ColorService;
import com.lzf.code.babasport.repository.ColorRepository;

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
public class ColorServiceImpl implements ColorService {
	private final ColorRepository colorRepository;

	@Autowired
	public ColorServiceImpl(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

}
