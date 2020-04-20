package demo.demooncondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConditionalOnProperty(name="environmentBean.enabled", havingValue = "true")
@Data
public class EnvironmentBean {

	private String message = "environemnt";
}
