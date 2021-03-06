package com.lzf.code.babasport.service.impl;

import com.lzf.code.babasport.service.FeatureService;
import com.lzf.code.babasport.repository.FeatureRepository;

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
public class FeatureServiceImpl implements FeatureService {
	private final FeatureRepository featureRepository;

	@Autowired
	public FeatureServiceImpl(FeatureRepository featureRepository) {
		this.featureRepository = featureRepository;
	}

}
