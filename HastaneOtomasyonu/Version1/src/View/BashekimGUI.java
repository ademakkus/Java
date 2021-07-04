package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Bashekim;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class BashekimGUI extends JFrame {

	private JPanel w_contentPane;
static Bashekim bashekim=new Bashekim();
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public BashekimGUI(Bashekim bashekim) {
		setTitle("Hastane Otomasyonu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 360);
		w_contentPane = new JPanel();
		w_contentPane.setForeground(Color.WHITE);
		w_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_contentPane);
		w_contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoş geldiniz Sayın, "+bashekim.getName());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 298, 23);
		w_contentPane.add(lblNewLabel);
	}
}
