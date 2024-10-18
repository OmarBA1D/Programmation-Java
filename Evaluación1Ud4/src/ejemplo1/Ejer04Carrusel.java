package ejemplo1;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer04Carrusel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private int i = 0;

    // Array de imágenes
    private ImageIcon[] imagenes;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ejer04Carrusel frame = new Ejer04Carrusel();
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
    public Ejer04Carrusel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Inicialización del array de imágenes
        imagenes = new ImageIcon[5];
        imagenes[0] = new ImageIcon(this.getClass().getResource("imagen1.jpg"));
        imagenes[1] = new ImageIcon(this.getClass().getResource("imagen2.jpg"));
        imagenes[2] = new ImageIcon(this.getClass().getResource("imagen3.jpg"));
        imagenes[3] = new ImageIcon(this.getClass().getResource("imagen4.jpg"));
        imagenes[4] = new ImageIcon(this.getClass().getResource("imagen5.jpg"));

        // JLabel para mostrar la imagen
        JLabel lblImagen = new JLabel();
        lblImagen.setIcon(imagenes[i]);
        lblImagen.setBounds(10, 10, 410, 200); // Ajusta el tamaño según tus imágenes
        contentPane.add(lblImagen);

        // Botón anterior
        JButton btnAnterior = new JButton("<<");
        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (i > 0) {
                    i--;
                    lblImagen.setIcon(imagenes[i]);
                }
                actualizarBotones();
            }
        });
        btnAnterior.setBounds(10, 227, 89, 23);
        contentPane.add(btnAnterior);

        // Botón siguiente
        JButton btnSiguiente = new JButton(">>");
        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (i < imagenes.length - 1) {
                    i++;
                    lblImagen.setIcon(imagenes[i]);
                }
                actualizarBotones();
            }
        });
        btnSiguiente.setBounds(335, 227, 89, 23);
        contentPane.add(btnSiguiente);

        // Botón última
        JButton btnUltima = new JButton("Última");
        btnUltima.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = imagenes.length - 1;
                lblImagen.setIcon(imagenes[i]);
                actualizarBotones();
            }
        });
        btnUltima.setBounds(220, 227, 105, 23);
        contentPane.add(btnUltima);

        // Botón primera
        JButton btnPrimera = new JButton("Primera");
        btnPrimera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = 0;
                lblImagen.setIcon(imagenes[i]);
                actualizarBotones();
            }
        });
        btnPrimera.setBounds(109, 227, 101, 23);
        contentPane.add(btnPrimera);

        // Actualizar el estado de los botones al inicio
        actualizarBotones();
    }

    // Método para habilitar/deshabilitar botones
    private void actualizarBotones() {
        // Aquí podrías habilitar o deshabilitar botones según el índice actual 'i'
    }
}