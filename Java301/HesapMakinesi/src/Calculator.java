import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
private double answer,number;
int operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void addInput(String str) {
	input.setText(input.getText()+str);
}
	/**
	 * Create the frame.
	 */
private void calculate() {
	switch(operation) {
	case 1:
		answer=number+Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
	case 2:
		answer=number-Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
	case 3:
		answer=number*Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
	case 4:
		answer=number/Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
	}
}
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblOperation = new JLabel("New label");
		lblOperation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOperation.setForeground(Color.RED);
		lblOperation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOperation.setBounds(10, 0, 527, 23);
		contentPane.add(lblOperation);
		JPanel panel = new JPanel();
		panel.setBounds(10, 31, 506, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setText("0");
		input.setFont(new Font("Tahoma", Font.PLAIN, 24));
		input.setBounds(10, 10, 456, 34);
		panel.add(input);
		input.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 90, 506, 299);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 4, 20, 0));
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
				lblOperation.setText(number+e.getActionCommand());
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=4;
				input.setText("");
			}
		});
		btnNewButton_div.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_div);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_mul = new JButton("X");
		btnNewButton_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=3;
				input.setText("");
			}
		});
		btnNewButton_mul.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_mul);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input.setText(input.getText()+e.getActionCommand());
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_minus = new JButton("-");
		btnNewButton_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=2;
				input.setText("");
			}
		});
		btnNewButton_minus.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_minus);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+e.getActionCommand());
			}
		});
		
		JButton btnNewButton_0_1 = new JButton("0");
		btnNewButton_0_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_0_1);
		btnNewButton_0.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_0);
		
		JButton btnNewButton_clear = new JButton("C");
		btnNewButton_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("0");
				
			}
			
		});
		btnNewButton_clear.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_clear);
		
		JButton btnNewButton_equal = new JButton("=");
		btnNewButton_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_equal.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_equal);
		
		JButton btnNewButton_0_2 = new JButton("0");
		btnNewButton_0_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_0_2);
		
		JButton btnNewButton_0_3 = new JButton("0");
		btnNewButton_0_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_0_3);
		
		JButton btnNewButton_0_4 = new JButton("<-");
		btnNewButton_0_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arr=input.getText();
				StringBuilder sb=new StringBuilder(arr);
				sb.deleteCharAt(arr.length()-1);
				input.setText(sb.toString());
			}
		});
		btnNewButton_0_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_0_4);
		
		JButton btnNewButton_add = new JButton("+");
		btnNewButton_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation=1;
				input.setText("");
			}
		});
		btnNewButton_add.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(btnNewButton_add);
		
		
	}
}
