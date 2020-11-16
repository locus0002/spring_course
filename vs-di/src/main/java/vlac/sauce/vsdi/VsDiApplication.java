package vlac.sauce.vsdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vlac.sauce.vsdi.controllers.MyController;

@SpringBootApplication
public class VsDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(VsDiApplication.class, args);
		MyController myCtrl = (MyController) ctx.getBean("myController");
		System.out.println(myCtrl.sayHello());
	}

}
