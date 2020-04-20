package demo.demooncondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import lombok.Data;

//depend on there exists the RequiredBean instance and should exist in the Spring Context
@Component
@ConditionalOnBean(RequiredBean.class) 
@Data
public class TestBean {

	private String Message;
	
}
