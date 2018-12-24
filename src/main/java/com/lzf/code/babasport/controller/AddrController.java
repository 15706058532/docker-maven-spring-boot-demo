package com.lzf.code.babasport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.babasport.service.AddrService;
/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/addr")
public class AddrController {
	private final AddrService addrService;

	@Autowired
	public AddrController(AddrService addrService) {
		this.addrService = addrService;
	}

}
