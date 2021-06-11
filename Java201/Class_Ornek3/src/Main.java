
public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog();
	dog.setName("Melo");
	dog.setBreed("Mama");
	dog.setAge(10);
	System.out.println("Dog name:"+dog.getName());
	System.out.println("Dog breed:"+dog.getBreed());
	System.out.println("Dog age:"+dog.getAge());
	
	Dog dog2=new Dog("Şanslı");
	dog2.setBreed("etçil");
	dog2.setAge(7);
	System.out.println("Dog name:"+dog2.getName());
	System.out.println("Dog breed:"+dog2.getBreed());
	System.out.println("Dog age:"+dog2.getAge());
	
	Dog dog3=new Dog("Süslü", "ornivor", 10);
	System.out.println("Dog name:"+dog3.getName());
	System.out.println("Dog breed:"+dog3.getBreed());
	System.out.println("Dog age:"+dog3.getAge());
	
	Dog dog4=new Dog("Garip", "Etçil ve otçul", 15);
	dog4.bilgileriYaz();
	}

}
