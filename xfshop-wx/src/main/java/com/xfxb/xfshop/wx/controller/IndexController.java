package com.xfxb.xfshop.wx.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xfxb.xfshop.service.domain.User;
import com.xfxb.xfshop.service.service.UserService;

/**
 * @author pigo.can
 * @email  rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date   2015年10月31日 上午1:18:22
 * @ver    V1.0
 */
@Controller

public class IndexController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/hao")
	public String renderName(@RequestParam Integer id,Model model){
		User user = userService.getDbName(id);
		model.addAttribute("name",user.getUsername());
		model.addAttribute("dbName",user.getUsername());
		return "pigo";
	}
}
