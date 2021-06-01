import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int len;
		System.out.println("Please enetr the length of array:");
		len=keyboard.nextInt();
		System.out.println("Please enter "+len+" different names :");
		String[] names=new String[len];
		
		for(int i=0;i<len;i++) {
			names[i]=keyboard.next();
		}
		System.out.println("The original Array is:"+Arrays.toString(names));
		System.out.println("The name before the last is:"+names[names.length-1]);
		System.out.println("Please enter the index of the new student name you want to add:");
		int index_=keyboard.nextInt();
		
		System.out.println("Please enter the new student name you want to add:");
		String[] tempArray=Arrays.copyOf(names, len+1);
		names=Arrays.copyOf(names, len+1);
		String newName=keyboard.nextLine();
		//
		for(int i = (len-1); i >= (index_-1); i--)
        {
            names[i+1] = names[i];
        }
        names[index_-1] = newName;
		
		//
		
		System.out.println("New Array is:"+Arrays.toString(names));
		System.out.println("The name before the last is:"+names[names.length-1]);
	
	}

}
