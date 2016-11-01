package xyz.ibenben.zhongdian.system.controller;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.ibenben.zhongdian.system.entity.RedisUtil;
import xyz.ibenben.zhongdian.system.service.StudentService;
@Controller
@RequestMapping("/student")
@Cacheable(value="test")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Resource
    private RedisTemplate<String,String> redisTemplate;
	@Resource
    private RedisUtil redisUtil;
	@RequestMapping("/getname")
	public String regiester(Map<String, Object> model){
		//System.out.println(studentService.getNameById(1));
		//model.put("msg", studentService.getNameById(1));
		redisUtil.set("1243", "测试1423");
		model.put("msg",redisUtil.get("1243"));
		System.out.println(redisUtil.get("1243"));
		return "regiester";
	}
}
