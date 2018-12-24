package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.TypeService;
import com.lzf.code.babasport.repository.TypeRepository;

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
public class TypeServiceImpl implements TypeService {
	private final TypeRepository typeRepository;

	@Autowired
	public TypeServiceImpl(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}

}
