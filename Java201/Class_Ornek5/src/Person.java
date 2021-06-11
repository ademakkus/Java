
public class Person {
private String name;
private String surname;
private int age;
private String tcNo;

//constructor

public Person(String adi,String soyadi,int yasi,String no) {
	this.name=adi;
	this.surname=soyadi;
	this.age=yasi;
	this.tcNo=no;
}
public void bilgileriYaz() {
	System.out.println("Adı:"+this.name+", soyadı:"+this.surname+", yaşı:"+this.age+" ,TC No:"+this.tcNo);
}
}
