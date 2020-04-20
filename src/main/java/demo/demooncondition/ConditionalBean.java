package demo.demooncondition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Conditional(TestConditional.class)
public class ConditionalBean {

	private String message = "conditional!!";
}
