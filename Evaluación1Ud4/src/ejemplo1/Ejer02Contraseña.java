package ejemplo1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Ejer02Contraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer02Contraseña frame = new Ejer02Contraseña();
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
	public Ejer02Contraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		Label label = new Label("contraseña");
		label.setBounds(134, 60, 70, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("usuario");
		label_1.setBounds(134, 34, 47, 22);
		contentPane.add(label_1);
		
		TextField textField1 = new TextField();
		textField1.setBounds(210, 34, 84, 22);
		contentPane.add(textField1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(210, 60, 84, 22);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.setBounds(187, 106, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField1.getText().equals("admin") && textField_2.getText().equals("admin")){
					JOptionPane.showMessageDialog(null, "Bienvenido");				
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o password desconocido");
				}
			}
		});
	}
}
