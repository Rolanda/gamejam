package niveaux;

import java.awt.Dimension;

import javax.swing.JFrame;

import utils.Constante;
import utils.Images;
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
		
		//fenetre.setLayout(null); connard
		
		
		Detritus d1 = new Detritus(false, 50, 50);
		System.out.println(Images.BLEU.getDescription());
		fenetre.getContentPane().add(d1);
				
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
