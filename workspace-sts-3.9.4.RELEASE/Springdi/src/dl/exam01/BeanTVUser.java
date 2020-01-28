package dl.exam01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanTVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		//TV samsung = (TV)factory.getBean("samsung");
		//TV lg = (TV)factory.getBean("lg");
		TV tv = factory.getBean("tv",TV.class);//이런 방식도 가능

		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}

}
