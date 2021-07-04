package Model;

public class User {
public User(int id, String tcno, String name, String password, String type) {
		super();
		this.id = id;
		this.tcno = tcno;
		this.name = name;
		this.password = password;
		this.type = type;
	}
public User() {
		super();
	}
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTcno() {
	return tcno;
}
public void setTcno(String tcno) {
	this.tcno = tcno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
private String tcno;
private String name;
private String password;
private String type;
}
