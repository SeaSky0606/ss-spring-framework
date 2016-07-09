package seasky.spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {

	@Bean
	SimpleService getService() {
		return new SimpleService() {

			@Override
			public void msg() {
				System.out.println("Hello spring!");
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		PrintWriter printWriter = context.getBean(PrintWriter.class);
		printWriter.print();
		
	}

}
