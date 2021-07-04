package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Helper.DBConnection;
import Helper.Helper;
public class Bashekim extends User{

	public Bashekim() {
		
	}
	Connection con=conn.connDb();
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement preparedStatement=null;
	public Bashekim(int id, String tcno, String name, String password, String type) {
		super(id, tcno, name, password, type);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<User> getDoctorList() throws SQLException{
		
		ArrayList<User> list=new ArrayList<>();
		User obj;
		try {
			st=con.createStatement();
			rs=st.executeQuery("SELECT * FROM user WHERE type='doktor'");
			while(rs.next()) {
				obj=new User(rs.getInt("id"),rs.getString("tcno"),rs.getString("name"),rs.getString("password"),rs.getString("type"));
				list.add(obj);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return list;
	}
public boolean addDoctor(String tcno,String password,String name) {
	String query="INSERT INTO user"+"(tcno,password,name,type)VALUES"+"(?,?,?,?)";
	try {
		st=con.createStatement();
		preparedStatement=con.prepareStatement(query);
		preparedStatement.setString(1, tcno);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, name);
		preparedStatement.setString(4, "doktor");
		preparedStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
}
public boolean deleteDoctor(int id)throws SQLException {
	String query="DELET FROM user WHERE id=?";
	try {
		st=con.createStatement();
		preparedStatement=con.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
}
}
