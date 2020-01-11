package dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	private DAO dao;
	@Autowired
	public Service(DAO dao) {
		
		this.dao = dao;
	}
	public void doWork()
	{
		System.out.println("Service dowork");
		dao.doWork();
	}

}
