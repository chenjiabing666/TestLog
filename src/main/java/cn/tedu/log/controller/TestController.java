package cn.tedu.log.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	private static Logger logger=Logger.getLogger(TestController.class);   //��ȡLogger����
	
	@RequestMapping("/test/test")
	@ResponseBody
	public String test(){
		System.out.println("����ǲ��Է���");
		System.out.println(System.getProperty("lifecrystal.root"));
		logger.debug("debug��Ϣ");
		logger.info("info��Ϣ");
		
		logger.error("�����error�������Ϣ");
		
		return "test";
	}
}
