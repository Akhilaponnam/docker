package dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OurController {
	private Service service;
	@Autowired
	public OurController(Service service) {
		
		this.service = service;
	}
	public void doWork()
	{
		System.out.println("Controller dowork");
		service.doWork();
	}

}
