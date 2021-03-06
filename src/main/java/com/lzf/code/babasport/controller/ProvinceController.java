package com.lzf.code.babasport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.babasport.service.ProvinceService;
/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {
	private final ProvinceService provinceService;

	@Autowired
	public ProvinceController(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}

}
