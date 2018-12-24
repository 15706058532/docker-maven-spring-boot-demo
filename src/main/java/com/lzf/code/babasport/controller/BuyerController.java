package com.lzf.code.babasport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.babasport.service.BuyerService;
/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/buyer")
public class BuyerController {
	private final BuyerService buyerService;

	@Autowired
	public BuyerController(BuyerService buyerService) {
		this.buyerService = buyerService;
	}

}
