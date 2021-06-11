
public class Dog {
private String name;
private String breed;
private int age;

//default constructor
public Dog() {
	
}
//
public Dog(String adi) {
	this.name=adi;
}
public Dog(String adi,String beslenme,int yas) {
	this.name=adi;
	this.breed=beslenme;
	this.age=yas;
}
public void bilgileriYaz() {
	System.out.println("Dog Name:"+this.name+" ,breeding :"+this.breed+", age:"+this.age);
}
//setter ve getter metotları
//setter : fielda değer atamak için
//getter :field daki değeri okumak için
public void  setName(String nm) {
	this.name=nm;
	
}
public String  getName() {
	return this.name;
}
public void setBreed(String brd) {
	this.breed=brd;
}
public String getBreed() {
	return breed;
}
public void setAge(int ag) {
	if(ag<0)
		this.age=0;
	else
		this.age=ag;
}
public int getAge() {
return age;
}
}
