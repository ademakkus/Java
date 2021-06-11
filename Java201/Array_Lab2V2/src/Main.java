import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		 int diziBoyutu;
		int i;
		System.out.println("Enter size of array :");
		diziBoyutu=keyboard.nextInt();
		String[] sehirler=new String[diziBoyutu];
		System.out.print("Type name of cities:");
		for(i=0;i<sehirler.length;i++) {
			
			sehirler[i]=keyboard.next();
		}
		
		for(String city:sehirler)	
			System.out.print(city+" ");
	}

}
