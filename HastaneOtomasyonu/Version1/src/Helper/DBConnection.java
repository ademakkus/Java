package Helper;
import java.sql.*;
public class DBConnection {
Connection conn=null;
public DBConnection() {}
public Connection connDb() {
	try {
		this.conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/hospital?user=root&password=123456");
		return conn;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}
}
