package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import Helper.DBConnection;
import Helper.Helper;
import Model.Bashekim;
public class LoginGUI extends JFrame {

	private JPanel w_pane;
	private final JTabbedPane w_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_doctor_tcno;
	private JPasswordField passwordField_doctor_password;
private DBConnection conn=new DBConnection();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setResizable(false);
		setTitle("Hastane Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500,507);
		w_pane = new JPanel();
		w_pane.setForeground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblLogo = new JLabel(new ImageIcon(getClass().getResource("md.png")));
		lblLogo.setBounds(81, -18, 256, 256);
		w_pane.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("Well Come to Hastane Yönetim Sistemi");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 199, 466, 32);
		w_pane.add(lblNewLabel);
		w_tabbedPane.setBounds(10, 248, 476, 212);
		w_pane.add(w_tabbedPane);
		
		JPanel w_hasta_login = new JPanel();
		w_hasta_login.setForeground(Color.WHITE);
		w_tabbedPane.addTab("Hasta Girişi", null, w_hasta_login, null);
		w_hasta_login.setLayout(null);
		
		JLabel lblTcNumaranz = new JLabel("TC Numaranız:");
		lblTcNumaranz.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcNumaranz.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblTcNumaranz.setBounds(0, 0, 172, 32);
		w_hasta_login.add(lblTcNumaranz);
		
		JLabel lblifre = new JLabel("Şifre:");
		lblifre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblifre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblifre.setBounds(10, 52, 162, 32);
		w_hasta_login.add(lblifre);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		textField.setBounds(178, 4, 237, 25);
		w_hasta_login.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		textField_1.setBounds(178, 56, 237, 25);
		w_hasta_login.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Kayıt Ol");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(46, 108, 172, 42);
		w_hasta_login.add(btnNewButton);
		
		JButton btnGiriYap = new JButton("Giriş Yap");
		btnGiriYap.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnGiriYap.setBounds(243, 108, 172, 42);
		w_hasta_login.add(btnGiriYap);
		
		JPanel w_doctor_login = new JPanel();
		w_tabbedPane.addTab("Doktor Girişi", null, w_doctor_login, null);
		w_doctor_login.setLayout(null);
		
		JLabel lblTcNumaranz_1 = new JLabel("TC Numaranız:");
		lblTcNumaranz_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTcNumaranz_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblTcNumaranz_1.setBounds(0, 10, 172, 32);
		w_doctor_login.add(lblTcNumaranz_1);
		
		textField_doctor_tcno = new JTextField();
		textField_doctor_tcno.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		textField_doctor_tcno.setColumns(10);
		textField_doctor_tcno.setBounds(178, 14, 237, 25);
		w_doctor_login.add(textField_doctor_tcno);
		
		JLabel lblifre_1 = new JLabel("Şifre:");
		lblifre_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblifre_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		lblifre_1.setBounds(10, 62, 162, 32);
		w_doctor_login.add(lblifre_1);
		
		JButton btnNewButton_1 = new JButton("Kayıt Ol");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(46, 118, 172, 42);
		w_doctor_login.add(btnNewButton_1);
		
		JButton btnGiriYap_1 = new JButton("Giriş Yap");
		btnGiriYap_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_doctor_tcno.getText().length()==0||passwordField_doctor_password.getText().length()==0) {
					//JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre giriniz.");
					Helper.showMessage("fill");
				}
				else {
					
					try {
						Connection con=conn.connDb();
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("SELECT * FROM user");
						while(rs.next()) {
							if(textField_doctor_tcno.getText().equals(rs.getString("tcno"))&&passwordField_doctor_password.getText().equals(rs.getString("password"))) {
								Bashekim bhekim=new Bashekim();
								bhekim.setId(rs.getInt("id"));
								bhekim.setTcno(rs.getString("tcno"));
								bhekim.setName(rs.getString("name"));
								bhekim.setType(rs.getString("type"));
								//System.out.println(bhekim.getName());
								BashekimGUI bashekimGUI=new BashekimGUI(bhekim);
								bashekimGUI.setVisible(true);
								dispose();
							}
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		});
		btnGiriYap_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnGiriYap_1.setBounds(253, 118, 172, 42);
		w_doctor_login.add(btnGiriYap_1);
		
		passwordField_doctor_password = new JPasswordField();
		passwordField_doctor_password.setFont(new Font("Tahoma", Font.PLAIN, 24));
		passwordField_doctor_password.setBounds(178, 62, 237, 25);
		w_doctor_login.add(passwordField_doctor_password);
	}
}
