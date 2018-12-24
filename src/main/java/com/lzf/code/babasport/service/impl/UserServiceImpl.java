package com.lzf.code.babasport.service.impl;

import com.lzf.code.common.BeanMapper;
import com.lzf.code.babasport.entity.User;
import com.lzf.code.babasport.resp.UserResp;
import com.lzf.code.babasport.service.UserService;
import com.lzf.code.babasport.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 16:04:04
 * <br/>
 *
 * @author Li zhenfeng
 */
@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserResp> findAll() {
		List<User> userList = userRepository.findAll();
		BeanMapper beanMapper = new BeanMapper();
		return beanMapper.mapList(userList, UserResp.class);
	}
}
