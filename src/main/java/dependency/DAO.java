package dependency;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DAO {
	@Autowired
	private BasicDataSource bd;
	public void doWork()
		{
			System.out.println("DAO dowork");
		
		
	try
	{
	Connection con=bd.getConnection();
	PreparedStatement ps=con.prepareStatement("insert into student(name,qual,marks)values(?,?,?)");
	ps.setString(1,"Nina");
	ps.setString(2,"BTECH");
	ps.setInt(3,90);
	ps.executeUpdate();
	//System.out.println("Done");
	ps.close();
	con.close();
	System.out.println("Done");
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
		


