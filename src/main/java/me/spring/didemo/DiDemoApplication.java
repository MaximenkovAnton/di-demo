package me.spring.didemo;

import me.spring.didemo.controllers.ConstructorInjectionController;
import me.spring.didemo.controllers.GetterInjectionController;
import me.spring.didemo.controllers.MyController;
import me.spring.didemo.controllers.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		System.out.println(context.getBean(MyController.class).sayHello());
		System.out.println(context.getBean(PropertyInjectionController.class).sayHello());
		System.out.println(context.getBean(GetterInjectionController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectionController.class).sayHello());
	}
}
