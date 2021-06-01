
public class Main {

	public static void main(String[] args) {
		//0-100 sayılardan 7 nin katı olan sayılar hariç ekrana yazsın
		
		for(int i=0;i<=100;i++) {
			if(i%7==0)
				continue;
			else
				System.out.println(i+" ");
		}
	}

}
