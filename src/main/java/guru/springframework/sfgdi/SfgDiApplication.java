package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		I18nController i18nController = (I18nController) context.getBean("i18nController");

		System.out.println("--------------Profiles");

		System.out.println(i18nController.getGreeting());


		System.out.println("--------------Primary");

		System.out.println(controller.getGreeting());

		System.out.println("-------------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());


	}

}
