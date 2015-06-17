package niveaux;

import java.awt.Dimension;

import javax.swing.JFrame;

import utils.Constante;
import Items.Item;
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
		fenetre.setLayout(null);
		

		
		/*Item d3 = new Item(true, 180, 150,50,50);
		d3.repaint();
		fenetre.getContentPane().add(d3);*/
		
		
		fenetre.setResizable(false);
		fenetre.pack();
		fenetre.setVisible(true);
		Item d1 = new Item(true, 150, 150,50,50);
		fenetre.getContentPane().add(d1);
		
		
		Item d2 = new Item(true, 170, 170,50,50);
		fenetre.getContentPane().add(d2);
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
