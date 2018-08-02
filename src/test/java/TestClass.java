import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.log.bean.Person;

public class TestClass {
	@Test
	public void test1(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-test.xml");
		Person person=context.getBean("person",Person.class);
		System.out.println(person);
		System.out.println("cd");
		context.close();
		
	}
}
