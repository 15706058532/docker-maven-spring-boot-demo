package com.lzf.code.babasport.service;

import com.lzf.code.babasport.resp.UserResp;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 16:04:04
 * <br/>
 *
 * @author Li zhenfeng
 */
public interface UserService {
    /**
     * 查询全部
     *
     */
    List<UserResp> findAll();
}
