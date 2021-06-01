import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			int len;
			System.out.println("Please enetr the length of array:");
			len=keyboard.nextInt();
			System.out.println("Please enter "+len+" different cities :");
			String[] cities=new String[len];
			
			for(int i=0;i<len;i++) {
				cities[i]=keyboard.next();
			}
			System.out.println("The original Array is:"+Arrays.toString(cities));
			System.out.println("The name before the last is:"+cities[cities.length-1]);
			System.out.println("Please enter the index of the new city you want to add:");
			int index_=keyboard.nextInt();
			System.out.println("Please enter the  city you want to add:");
			String newCity=keyboard.next();
			cities=Arrays.copyOfRange(cities,0, len+1);
			
			//System.out.println("New Array is:"+Arrays.toString(cities));

			for(int i = (len-1); i >= (index_ - 1); i--)
			  {
			     cities[i + 1] = cities[i];
			  }
			  cities[index_- 1] = newCity;
			//
			  System.out.println("New Array before sort is:"+Arrays.toString(cities));
			
			//sort array
			  int size=cities.length;
			  for(int i = 0; i<size-1; i++) {
			         for (int j = i+1; j<cities.length; j++) {
			            if(cities[i].compareTo(cities[j])>0) {
			               String temp = cities[i];
			               cities[i] = cities[j];
			               cities[j] = temp;
			            }
			         }
			      }
			  
			  ///
			
			
			System.out.println("The name before the last is:"+cities[cities.length-1]);
			System.out.println("New Array is:"+Arrays.toString(cities));
			System.out.println("The name before the last is:"+cities[cities.length-1]);
		}
	

	}

}
