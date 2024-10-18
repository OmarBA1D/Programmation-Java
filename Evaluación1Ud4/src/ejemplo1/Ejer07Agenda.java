package ejemplo1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ejer07Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer07Agenda frame = new Ejer07Agenda();
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
	public Ejer07Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(20, 11, 56, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(20, 36, 56, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(20, 61, 56, 14);
		contentPane.add(lblDNI);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(20, 86, 56, 14);
		contentPane.add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(81, 8, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 33, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 58, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 86, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(264, 36, 160, 23);
		btnAñadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.add(btnAñadir);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 292, 804, 148);
		contentPane.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre"); 
		modelo.addColumn("Apellidos"); 
		modelo.addColumn("DNI");
		modelo.addColumn("Teléfono");
		
		JTable table = new JTable (modelo);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		table.getTableHeader().setFont(new Font ("arial", 1, 13));
	}
}
