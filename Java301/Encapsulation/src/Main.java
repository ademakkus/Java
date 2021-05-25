
class Insan{
	
	private int yas;
	
	void setYas(int yas) {
		if(yas<0)
		{
			this.yas=0;
			System.out.println("Yanlış değer");
		}
		else
			this.yas=yas;
		
	}
	int getYas() {
		return yas;
	}
	
}
//
public class Main {

	public static void main(String[] args) {
		Insan insan=new Insan();
		insan.setYas(12);
		System.out.println(insan.getYas());
		

	}

}
