package demo.demooncondition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoOnconditionApplication {
	
	// test condition on bean
	@Autowired
	private TestBean testBean;

	// test condition on environment variable
	@Autowired
	private EnvironmentBean environmentBean;
	
	// test condition on Conditional Class
	@Autowired
	private ConditionalBean conditionalBean;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOnconditionApplication.class, args);
	}
	
	
	@Bean
	public ApplicationRunner applicationRunner() {
		
		return ( e-> {
			log.info("application runner..");
			
			testBean.setMessage("test");
			
			log.info("this is the message: {}", testBean.getMessage());
			
			log.info("environment message: {}", environmentBean.getMessage());
			
			log.info("conditional message: {}", conditionalBean.getMessage());
		});
	}

}
