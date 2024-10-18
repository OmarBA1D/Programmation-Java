package ejemplo1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej05Paneles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej05Paneles frame = new Ej05Paneles();
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
	public Ej05Paneles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
        cardLayout = new CardLayout(0, 0);
        contentPane.setLayout(cardLayout);
        
		JPanel redPanel = new JPanel();
		redPanel.setBackground(new Color(255, 0, 0));
		contentPane.add(redPanel, "redPanel");
		redPanel.setLayout(null);
		
		JButton redBtn = new JButton("¡Pulsa!");
		redBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "greenPanel");
			}
		});
		redBtn.setBounds(160, 115, 90, 30);
		redPanel.add(redBtn);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0, 255, 0));
		contentPane.add(greenPanel, "greenPanel");
		greenPanel.setLayout(null);
		
		JButton greenBtn = new JButton("¡Pulsa!");
		greenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "bluePanel");
				
			}
		});
		greenBtn.setBounds(160, 115, 90, 30);
		greenPanel.add(greenBtn);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0, 128, 255));
		contentPane.add(bluePanel, "bluePanel");
		bluePanel.setLayout(null);
		
		JButton blueBtn = new JButton("¡Pulsa!");
		blueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "redPanel");
			}
		});
		blueBtn.setBounds(160, 115, 90, 30);
		bluePanel.add(blueBtn);
	}
}
