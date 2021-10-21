package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","root");
			if(con!=null)
			{
				System.out.println("connected.....");
			}
			else
			{
				System.out.println("not connected......");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return con;
		
	}

}
