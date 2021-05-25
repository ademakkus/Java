
public class Main {

	public static void main(String[] args) {
		Insan insan=new Insan();  //nesne:sınıftan örnek (instance ) oluşturma
insan.ad="Adem";
insan.boy=186;
insan.parmaksayisi=10;
insan.soyad="AKKUŞ";
insan.yas=40;
System.out.println(insan.ad);
System.out.println(insan.soyad);
System.out.println(insan.yas);
System.out.println(insan.boy);
insan.Uyuma();
insan.Yeme();



	}

}
