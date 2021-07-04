package Helper;

import javax.swing.JOptionPane;

public class Helper {
public static void showMessage(String str) {
	String msg;
	switch(str) {
	case "fill":
		msg="Lütfen tüm alanları doldurunuz!";break;
		default:
			msg=str;
		
	}
	JOptionPane.showMessageDialog(null,msg,"Uyarı Mesajı", JOptionPane.INFORMATION_MESSAGE);
}

}
