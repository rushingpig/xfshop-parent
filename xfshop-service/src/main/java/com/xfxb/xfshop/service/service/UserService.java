package com.xfxb.xfshop.service.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xfxb.xfshop.service.dao.UserMapper;
import com.xfxb.xfshop.service.domain.User;

/**
 * @author pigo.can
 * @email  rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date   2015年11月2日 上午12:54:26
 * @ver    V1.0
 */
@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	
	public User getDbName(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
}
