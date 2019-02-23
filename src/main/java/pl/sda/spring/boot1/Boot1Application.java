package pl.sda.spring.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot1Application.class, args);
		context.getBean(GreetingService.class).greetings();
	}

}
