package by.htp.lesson.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {
	@Value("Chris Schaefer")
	private String name;
	
	@Value("32")
	private int age;

	@Value("1.77811")
	private float height;
	
	@Value("true")
	private boolean programmer;
	
	@Value("1009843200")
	private Long ageinSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("applicationContext.xml");
		ctx.refresh();
		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(simple);
	}

	public String toString() {
		return " Name: " + name + "\n " + "Age: " + age + " \n" + " Age in Seconds: " + ageinSeconds + " \n"
				+ " Height: " + height + " \n" + " Is Programmer?: " + programmer;
	}
}
