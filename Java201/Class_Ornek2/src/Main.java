public class Main {

	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.name="Melo";
	dog.breed="Mama";
	dog.age=-7;
	System.out.println(dog.name);
	System.out.println(dog.breed);
	System.out.println(dog.age);
	dog.besle();
	dog.uyu();
	
	Dog dog2=new Dog();
	dog2.name="Şanslı";
	dog2.breed="taze et";
	dog2.age=-10;
	System.out.println(dog2.name+" "+dog2.breed+" "+dog2.age);
	dog2.besle();
	dog2.uyu();

	}

}
