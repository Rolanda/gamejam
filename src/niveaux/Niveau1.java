package niveaux;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import utils.Constante;
import Items.Detritus;
/**
 * premier niveau
 * 
 * pour le mioment affiche qu'un fenetre
 * @author Nordic Binary
 *
 */
public class Niveau1 {
	private JFrame fenetre;
	
	/**
	 * Constructeur
	 */
	Niveau1(){
		fenetre = new JFrame("Gamejam");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(Constante.ECRANX, Constante.ECRANY));
		//fenetre.setLayout(null); // conard c toi la merde
		
		Detritus d1 = new Detritus(true, 150, 150, 50, 50);
		d1.repaint();
		fenetre.getContentPane().add(d1);
		
//		Detritus d2 = new Detritus(true, 500, 500);
//		d2.repaint();
//		fenetre.getContentPane().add(d2);
		
		fenetre.setResizable(false);
		fenetre.pack();
		fenetre.setVisible(true);
	}
	
	/**
	 * petite "main" de test
	 * @param arg
	 */
	public static void main(String[] arg){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Niveau1();
			}
		});
	}
}