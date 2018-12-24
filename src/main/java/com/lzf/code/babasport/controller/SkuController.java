package com.lzf.code.babasport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.babasport.service.SkuService;
/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/sku")
public class SkuController {
	private final SkuService skuService;

	@Autowired
	public SkuController(SkuService skuService) {
		this.skuService = skuService;
	}

}
