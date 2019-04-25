import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class NivelesExtra extends JFrame {

	JPanel nivelesExtra;
	
	
	
	public NivelesExtra() {
		
		
	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 962, 620);
        nivelesExtra = new JPanel();
        nivelesExtra.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(nivelesExtra);
        nivelesExtra.setLayout(new GridLayout(1, 0, 0, 0));
        
        JButton btnNewButton_12luces = new JButton("12 Luces");
        btnNewButton_12luces.setFont(new Font("Tahoma", Font.PLAIN, 50));
        btnNewButton_12luces.setForeground(Color.WHITE);
        btnNewButton_12luces.setBackground(Color.BLACK);
        btnNewButton_12luces.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 // Instancias el nuevo frame
 		      SeleccionNivel selectNiv = new SeleccionNivel(4, 3);
 		        // lo haces visible
 		        selectNiv.setVisible(true);
 		        // haces invisible el frame actual
 		       nivelesExtra.setVisible(false);
        		
        		
        		
        		
        	}
        });
        nivelesExtra.add(btnNewButton_12luces);
        
        JButton btnNewButton_16luces = new JButton("16 Luces");
        btnNewButton_16luces.setFont(new Font("Tahoma", Font.PLAIN, 50));
        btnNewButton_16luces.setForeground(Color.WHITE);
        btnNewButton_16luces.setBackground(Color.BLACK);
        btnNewButton_16luces.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 // Instancias el nuevo frame
   		      SeleccionNivel selectNiv = new SeleccionNivel(4, 4);
   		        // lo haces visible
   		        selectNiv.setVisible(true);
   		        // haces invisible el frame actual
   		       nivelesExtra.setVisible(false);
        	}
        });
        nivelesExtra.add(btnNewButton_16luces);
        
        JButton btnNewButton_25luces = new JButton("25 Luces");
        btnNewButton_25luces.setFont(new Font("Tahoma", Font.PLAIN, 50));
        btnNewButton_25luces.setForeground(Color.WHITE);
        btnNewButton_25luces.setBackground(Color.BLACK);
        btnNewButton_25luces.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 // Instancias el nuevo frame
     		      SeleccionNivel selectNiv = new SeleccionNivel(5, 5);
     		        // lo haces visible
     		        selectNiv.setVisible(true);
     		        // haces invisible el frame actual
     		       nivelesExtra.setVisible(false);
        	}
        });
        nivelesExtra.add(btnNewButton_25luces);
        
        JButton btnNewButton_100luces = new JButton("100 Luces");
        btnNewButton_100luces.setHorizontalAlignment(SwingConstants.TRAILING);
        btnNewButton_100luces.setFont(new Font("Tahoma", Font.PLAIN, 44));
        btnNewButton_100luces.setForeground(Color.WHITE);
        btnNewButton_100luces.setBackground(Color.BLACK);
        btnNewButton_100luces.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 // Instancias el nuevo frame
     		      SeleccionNivel selectNiv = new SeleccionNivel(10, 10);
     		        // lo haces visible
     		        selectNiv.setVisible(true);
     		        // haces invisible el frame actual
     		       nivelesExtra.setVisible(false);
        	}
        });
        nivelesExtra.add(btnNewButton_100luces);
	}
	

	
	

}
