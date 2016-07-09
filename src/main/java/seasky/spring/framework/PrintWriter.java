package seasky.spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintWriter {
	
	private SimpleService service;
	
	public PrintWriter() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public PrintWriter(SimpleService service) {
		this.service = service;
	}
	
	public void print(){
		service.msg();
	}
	
}
