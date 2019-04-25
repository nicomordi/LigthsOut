import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Juego {
	

	private JFrame frame;
	private JTextField txtLigthsOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Juego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 943, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 28));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 // Instancias el nuevo frame
		        SeleccionNivel sNivel = new SeleccionNivel(3, 3);
		        // lo haces visible
		        sNivel.setVisible(true);
		        // haces invisible el frame actual
		        Juego.this.frame.dispose();
				
			}
		});
		btnNewButton.setBounds(121, 377, 278, 159);
		frame.getContentPane().add(btnNewButton);
		
		txtLigthsOut = new JTextField();
		txtLigthsOut.setHorizontalAlignment(SwingConstants.CENTER);
		txtLigthsOut.setForeground(Color.WHITE);
		txtLigthsOut.setBackground(Color.BLACK);
		txtLigthsOut.setFont(new Font("Snap ITC", Font.BOLD, 68));
		txtLigthsOut.setText("Ligths Out");
		txtLigthsOut.setBounds(204, 46, 511, 182);
		frame.getContentPane().add(txtLigthsOut);
		txtLigthsOut.setColumns(10);
		
		JButton btnNiveles = new JButton("Niveles");
		btnNiveles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 // Instancias el nuevo frame
		       NivelesExtra nExtr = new NivelesExtra();
		        // lo haces visible
		        nExtr.setVisible(true);
		        // haces invisible el frame actual
		        Juego.this.frame.dispose();
				
				
				
			}
		});
		btnNiveles.setForeground(Color.WHITE);
		btnNiveles.setFont(new Font("Snap ITC", Font.PLAIN, 28));
		btnNiveles.setBackground(Color.BLACK);
		btnNiveles.setBounds(520, 377, 278, 159);
		frame.getContentPane().add(btnNiveles);
	}
	
	
}
