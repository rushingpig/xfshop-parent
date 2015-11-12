package com.xfxb.xfshop.wx;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xfxb.xfshop.service.dao.UserMapper;

/**
 * @author pigo.can
 * @email  rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date   2015年11月12日 下午9:51:39
 * @ver    V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/spring-context.xml")
public class MybatisJoinTest {
	
	@Resource
	private UserMapper userMapper;
	
	
	@Test
	public void mybatisJoinSelect(){
//		User user = new User();
//		Page<User> page = new Page<>();
//		user.setPage(page);
//		user.getPage().setPageNo(1);
//		user.getPage().setPageSize(10);
//		List<User> users = userMapper.list(user);
//		System.out.println(users.size());
//		
//		for(User u : users){
//			System.out.println(u);
//		}
		
		Map<String, Object> map = userMapper.selectByPrimary(1);
		System.out.println(map);
	}

}
