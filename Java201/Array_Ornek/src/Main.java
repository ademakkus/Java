import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	int diziBoyutu;
	int i;
	System.out.println("Enter size of array :");
	diziBoyutu=keyboard.nextInt();
	String[] sehirler=new String[diziBoyutu];
	
	for(i=0;i<sehirler.length;i++) {
		System.out.print("Type name of city:");
		sehirler[i]=keyboard.next();
	}
	System.out.println();
for(String city:sehirler) {
	System.out.print(city+" ");
	}
System.out.println("\nPrint with Arrays.ToString()");
System.out.println(Arrays.toString(sehirler));
	}

}
