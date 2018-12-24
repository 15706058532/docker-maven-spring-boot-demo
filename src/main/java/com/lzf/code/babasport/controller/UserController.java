package com.lzf.code.babasport.controller;

import com.lzf.code.babasport.resp.UserResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.code.babasport.service.UserService;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 16:04:04
 * <br/>
 *
 * @author Li zhenfeng
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/find/all")
    public List<UserResp> findAll() {
        return userService.findAll();
    }

}
