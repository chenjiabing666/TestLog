package cn.tedu.log.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	private static Logger logger=Logger.getLogger(TestController.class);   //获取Logger对象
	
	@RequestMapping("/test/test")
	@ResponseBody
	public String test(){
		System.out.println("这个是测试方法");
		System.out.println(System.getProperty("lifecrystal.root"));
		logger.debug("debug信息");
		logger.info("info信息");
		
		logger.error("这个是error级别的信息");
		
		return "test";
	}
}
