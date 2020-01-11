package dependency;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dependency")
public class OurConfiguration {
	@Bean
	public BasicDataSource basicDataSource()
	{
		BasicDataSource bd= new BasicDataSource();
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bd.setUrl("jdbc:mysql://localhost:3306/data");
		bd.setUsername("root");
		bd.setPassword("akhilanina");
		return bd;
	}
	

}
