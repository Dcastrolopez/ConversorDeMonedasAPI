package mConversorAPI.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 684, 376);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor de Dólares y Colones");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.lightGray);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 664, 44);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Conversor de dólares");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.lightGray);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorDeDólares conversor = new ConversorDeDólares();
	            conversor.setVisible(true);
	            dispose();			}
		});
		btnNewButton.setBounds(30, 113, 188, 44);
		panel.add(btnNewButton);
		
		JButton btnConversorDeClones = new JButton("Conversor de colones");
		btnConversorDeClones.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnConversorDeClones.setBackground(Color.BLACK);
		btnConversorDeClones.setForeground(Color.lightGray);
		btnConversorDeClones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorDeColones conversorC = new ConversorDeColones(); 
				conversorC.setVisible(true);
				dispose();
			}
		});
		btnConversorDeClones.setBounds(465, 113, 188, 44);
		panel.add(btnConversorDeClones);
		
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\d04ca\\Downloads\\Wallpapers\\dollar-colon-exchange.jpg");
		
		JLabel lblNewLabel_1 = new JLabel(imageIcon);
		lblNewLabel_1.setBounds(10, 66, 664, 299);
		panel.add(lblNewLabel_1);
		
		

	}
}
