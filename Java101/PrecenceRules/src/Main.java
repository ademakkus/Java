
public class Main {

	public static void main(String[] args) {
		//++ unary
		int a=10;
		int b=++a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		int x=23;
		int y=x++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		//-- unary
		int d=100;
		int f=--d;	//d=99,f=99
		System.out.println("d="+d);
		System.out.println("f="+f);
		int g=200;
		int h=g--;
		System.out.println("g="+g);
		System.out.println("h="+h);
		

	}

}
