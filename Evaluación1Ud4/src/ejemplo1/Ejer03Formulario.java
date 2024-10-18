package ejemplo1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer03Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido1;
	private JTextField tfApellido2;
	private JTextField tfDniNie;
	private JTextField tfEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer03Formulario frame = new Ejer03Formulario();
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
	public Ejer03Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(39, 22, 46, 14);
		contentPane.add(labelNombre);
		
		JLabel LabelApellido1 = new JLabel("Apellido 1");
		LabelApellido1.setBounds(39, 55, 46, 14);
		contentPane.add(LabelApellido1);
		
		JLabel labelApellido2 = new JLabel("Apellido 2");
		labelApellido2.setBounds(39, 91, 46, 14);
		contentPane.add(labelApellido2);
		
		JLabel labelEdad = new JLabel("Edad");
		labelEdad.setBounds(39, 170, 46, 14);
		contentPane.add(labelEdad);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(151, 19, 86, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido1 = new JTextField();
		tfApellido1.setBounds(151, 52, 86, 20);
		contentPane.add(tfApellido1);
		tfApellido1.setColumns(10);
		
		tfApellido2 = new JTextField();
		tfApellido2.setBounds(151, 88, 86, 20);
		contentPane.add(tfApellido2);
		tfApellido2.setColumns(10);
		
		tfDniNie = new JTextField();
		tfDniNie.setBounds(151, 126, 86, 20);
		contentPane.add(tfDniNie);
		tfDniNie.setColumns(10);
		
		tfEdad = new JTextField();
		tfEdad.setBounds(151, 167, 86, 20);
		contentPane.add(tfEdad);
		tfEdad.setColumns(10);
		
		 String[] opciones = {"DNI", "NIE"};
		JComboBox cbDniNie = new JComboBox(opciones);
		cbDniNie.setBounds(39, 125, 46, 22);
		contentPane.add(cbDniNie);
		
		JButton btnAcceptar = new JButton("Acceptar");
		btnAcceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAcceptar.setBounds(148, 216, 89, 23);
		contentPane.add(btnAcceptar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnLimpiar.setBounds(303, 216, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
