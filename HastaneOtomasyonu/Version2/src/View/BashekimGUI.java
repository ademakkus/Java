package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Helper.Helper;
import Model.Bashekim;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BashekimGUI extends JFrame {

private JPanel w_contentPane;
static Bashekim bashekim=new Bashekim();
private JTextField textField_name;
private JTextField textField_tcno;
private JTextField textField_password;
private JTextField textField_doctor_id;
private JTable table_doctor;
private DefaultTableModel doctorModel=null;
private Object[] doctorData=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BashekimGUI frame = new BashekimGUI(bashekim);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public BashekimGUI(Bashekim bashekim) {
	
		doctorModel=new DefaultTableModel();
		Object[] colDoctorName=new Object[4];
		colDoctorName[0]="ID";
		colDoctorName[1]="Ad Soyad";
		colDoctorName[2]="TC No";
		colDoctorName[3]="Şifre";
		doctorModel.setColumnIdentifiers(colDoctorName);
		doctorData=new Object[4];
		try {
			for(int i=0;i<bashekim.getDoctorList().size();i++) {
				doctorData[0]=bashekim.getDoctorList().get(i).getId();
				doctorData[1]=bashekim.getDoctorList().get(i).getName();
				doctorData[2]=bashekim.getDoctorList().get(i).getTcno();
				doctorData[3]=bashekim.getDoctorList().get(i).getPassword();
				doctorModel.addRow(doctorData);
				
			}
		}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		finally {
			
		}
		
		setTitle("Hastane Otomasyonu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 405);
		w_contentPane = new JPanel();
		w_contentPane.setForeground(Color.WHITE);
		w_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_contentPane);
		w_contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoş geldiniz Sayın, "+bashekim.getName());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 298, 23);
		w_contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Çıkış Yap");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(430, 11, 135, 25);
		w_contentPane.add(btnNewButton);
		
		JTabbedPane w_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		w_tabbedPane.setBounds(31, 43, 549, 315);
		w_contentPane.add(w_tabbedPane);
		
		JPanel panel = new JPanel();
		w_tabbedPane.addTab("Doktor Yönetimi", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ad Soyad:");
		lblNewLabel_1.setBounds(317, 6, 196, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("T.C. No:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(317, 61, 196, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Kullanıcı ID:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(317, 198, 196, 24);
		panel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Sil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_doctor_id.getText().length()==0)
					Helper.showMessage("Lütfen silinecek geçerli id giriniz!");
				else
				{
					if(Helper.confirm("sure")){
						int selectedID=Integer.parseInt(textField_doctor_id.getText());
					}
				}
				int selectedID=Integer.parseInt(textField_doctor_id.getText());
				try {
					boolean control=bashekim.deleteDoctor(selectedID);
					if(control) {
						Helper.showMessage("success");
						textField_doctor_id.setText(null);
						updateDoctorModel();
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(317, 253, 196, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Ekle");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(textField_name.getText().length()==0||textField_password.getText().length()==0||textField_tcno.getText().length()==0) {
				Helper.showMessage("fill");
			}
			else {
				boolean control=bashekim.addDoctor(textField_tcno.getText(), textField_password.getText(),textField_name.getText());
				if(control)
					Helper.showMessage("success");
				textField_tcno.setText(null);
				textField_name.setAction(null);
				textField_password.setText(null);
				
			}
			try {
				updateDoctorModel();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(317, 171, 196, 25);
		panel.add(btnNewButton_1_1);
		
		textField_name = new JTextField();
		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_name.setBounds(317, 31, 196, 24);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		textField_tcno = new JTextField();
		textField_tcno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_tcno.setColumns(10);
		textField_tcno.setBounds(317, 86, 196, 24);
		panel.add(textField_tcno);
		
		textField_password = new JTextField();
		textField_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_password.setColumns(10);
		textField_password.setBounds(317, 141, 196, 24);
		panel.add(textField_password);
		
		textField_doctor_id = new JTextField();
		textField_doctor_id.setEditable(false);
		textField_doctor_id.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_doctor_id.setColumns(10);
		textField_doctor_id.setBounds(317, 223, 196, 24);
		panel.add(textField_doctor_id);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Şifre:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(317, 116, 196, 24);
		panel.add(lblNewLabel_1_1_2);
		
		JScrollPane w_scrollPane_doctor = new JScrollPane();
		w_scrollPane_doctor.setBounds(10, 6, 301, 272);
		panel.add(w_scrollPane_doctor);
		
		table_doctor = new JTable(doctorModel);
		w_scrollPane_doctor.setViewportView(table_doctor);
		table_doctor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
public void valueChanged(ListSelectionEvent e) {
				
				try {
					textField_doctor_id.setText(table_doctor.getValueAt(table_doctor.getSelectedRow(), 0).toString());
				}
				catch(Exception ex) {
					//ex.printStackTrace();
				}
			}
		});
	}
public void updateDoctorModel() throws SQLException {
	DefaultTableModel clearModel=(DefaultTableModel) table_doctor.getModel();
	clearModel.setRowCount(0);
	for(int i=0;i<bashekim.getDoctorList().size();i++) {
		doctorData[0]=bashekim.getDoctorList().get(i).getId();
		doctorData[1]=bashekim.getDoctorList().get(i).getName();
		doctorData[2]=bashekim.getDoctorList().get(i).getTcno();
		doctorData[3]=bashekim.getDoctorList().get(i).getPassword();
		doctorModel.addRow(doctorData);
		
	}
}
}




