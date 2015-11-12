package com.xfxb.xfshop.service.dao;

import java.util.List;
import java.util.Map;

import com.xfxb.xfshop.service.domain.User;

/**
 * @author pigo.can
 * @email  rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date   2015年11月12日 下午10:08:17
 * @ver    V1.0
 */
public interface UserMapper {
	
	User selectByPrimaryKey(Integer id);
	
	Map<String, Object> selectByPrimary(Integer id);
	
	List<User> list(User user);

}
