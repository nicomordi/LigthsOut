import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SeleccionNivel extends JFrame {

	private JPanel contentPane;
	private int filas;
	private int columnas;
	private JButton botones[][];
	private int cantBotones;
	private Random r1 = new Random();
	private boolean juegoTerminado = false;

	public SeleccionNivel(int filas, int columnas) {

	
		this.columnas = columnas;
		this.filas = filas;
		botones = new JButton[filas][columnas];
		cantBotones= columnas*filas;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridLayout grillaJuego = new GridLayout(filas, columnas);
		crearBotones();

		contentPane.setLayout(grillaJuego);
	}

	public void crearBotones() { //Crear todos los botones de la grilla y los pinta de color blanco

		Random r1 = new Random();
		int valorRandom = r1.nextInt(cantBotones - 1);
		{
			for (int i = 0; i < botones.length; i++) {
				for (int j = 0; j < botones[i].length; j++) {

					botones[i][j] = new JButton();
					botones[i][j].setText("");
					botones[i][j].setBackground(Color.WHITE);
					botones[i][j].addActionListener(new buttonListener());

					add(botones[i][j]); 
				}
			}
		}
		
		for (JButton[] jButtons : botones) {
			for (JButton boton : jButtons) {
				
				boolean temp = r1.nextBoolean();
				if(temp)
				{
					boton.doClick();
				}
				
			}
			
		}
	}

	public class buttonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			boolean apretado = false;
			int x = 0;
			int y= 0;
			
			for (int i = 0; i < botones.length; i++) {
				for (int j = 0; j < botones[i].length; j++) {
					if (((JButton) e.getSource()).equals(botones[i][j])) {
						apretado = true;
						x = i;
						y = j;
						break;
					}
				}
				if (apretado) {
					break;
				}
			}
			//Las proximas lineas se fijan como estan los botones que rodean al que se esta oprimiendo
			cambiarColor(botones[x][y]);
			if (x > 0) {
				cambiarColor(botones[x - 1][y]);
			}
			if (x < botones.length - 1) {
				cambiarColor(botones[x + 1][y]);
			}
			if (y > 0) {
				cambiarColor(botones[x][y - 1]);
			}
			if (y < botones[x].length - 1) {
				cambiarColor(botones[x][y + 1]);
			}
			if (verificarSiTermino()) {
				for (JButton[] botonesFila : botones) {
					for (JButton boton : botonesFila) {
						boton.setBackground(Color.CYAN);
						boton.setText("Juego Terminado");
						boton.setEnabled(false);
						juegoTerminado = true;
					}
				}
			}

		}
		
		private boolean verificarSiTermino() {// Verifica si el juego termino
			
			for (JButton[] botonesFila : botones) {
				for (JButton boton : botonesFila) {
					if (boton.getBackground() == Color.white) {
						return false;
					}
				}
			}
			return true;
		}
		}

		public void cambiarColor(JButton button) {//Para cambiar el color de los botones
			if (button.getBackground().equals(Color.black)) {
				button.setBackground(Color.white);
			} else {
				button.setBackground(Color.black);
			}
		}
		

}


		/*
		 * 
		 * public boolean chequearBotonesIzqDer(int a) { if (
		 * botones[a].getBackground().equals(Color.WHITE) &&
		 * botones[a].getBackground().equals(botones[a-1].getBackground()) &&
		 * botones[a].getBackground().equals(botones[a+1].getBackground())) {
		 * 
		 * botones[a].setBackground(Color.BLACK);
		 * botones[a-1].setBackground(Color.WHITE);
		 * botones[a+1].setBackground(Color.WHITE);
		 * 
		 * return true; } return false; }
		 * 
		 * public boolean chequeoGanador() { for (int i = 0; i < botones.length; i++) {
		 * if(chequearBotonesIzqDer(i)==true) return true;
		 * 
		 * }
		 * 
		 * return false; }
		 */
	
