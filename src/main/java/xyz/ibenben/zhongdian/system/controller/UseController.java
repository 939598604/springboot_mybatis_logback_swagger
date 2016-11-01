package xyz.ibenben.zhongdian.system.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.ibenben.zhongdian.system.entity.User;
import xyz.ibenben.zhongdian.system.service.UserService;

@Controller
@RequestMapping("/system/user")
public class UseController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/regiester")
	public String regiester(Map<String, Object> model){
		User user = new User();
		user.setUsername("chen");
		user.setState(1);
		userService.saveUser(user);
		model.put("msg", "张4丰");		
		return "regiester";
	}
}
