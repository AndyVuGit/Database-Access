
import java.sql.*;

public class home {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection mainConnection = DriverManager.getConnection("jdbc:mysql:---fill in the rest----", "username", "password");
		
		
		//Creates a statement to send to mysql datatbase
		Statement testState = mainConnection.createStatement();	
		ResultSet mySet = testState.executeQuery("Select *");
		
		//Get the metadata(information about the data) from our set
		ResultSetMetaData myData = mySet.getMetaData();
		System.out.println("# of columns = " + myData.getColumnCount());
		
		
		//Accessing the information we got from the database
		while(mySet.next())
		{
			System.out.println(mySet.getString(1));
			System.out.println(mySet.getInt(2));
			System.out.println();
		}
		
	}
}
