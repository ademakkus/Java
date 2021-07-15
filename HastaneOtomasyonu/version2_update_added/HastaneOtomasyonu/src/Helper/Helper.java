package Helper;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helper {
public static void showMessage(String str) {
	String msg;
	optionPaneChangeButtonText(); 
	switch(str) {
	case "fill":
		msg="Lütfen tüm alanları doldurunuz!";break;
		
	case "success":
		msg="İşlem başarılı!";break;
	default:
			msg=str;
		
	}
	JOptionPane.showMessageDialog(null,msg,"Uyarı Mesajı", JOptionPane.INFORMATION_MESSAGE);
	optionPaneChangeButtonText(); 
}
public static boolean confirm(String str) {
String msg;
optionPaneChangeButtonText(); 
switch(str) {
case "sure":msg="Bu işlemi gerçekleştirmek istiyor musunuz?";break;
default:msg=str;break;

}
int res=JOptionPane.showConfirmDialog(null, msg, "Dikkat !", JOptionPane.YES_NO_OPTION);
optionPaneChangeButtonText(); 
if(res==0)
	return true;
else
	return false;
}
public static void optionPaneChangeButtonText() {
	UIManager.put("OptionPane.cancelButtonText", "İptal");
	UIManager.put("OptionPane.noButtonText", "Hayır");
	UIManager.put("OptionPane.okButtonText", "Tamam");
	UIManager.put("OptionPane.yesButtonText", "Evet");
}

}

