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
		
		Detritus d1 = new Detritus(true, 150, 150);
		d1.repaint();
		fenetre.getContentPane().add(d1);
		
		d1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(e.getSource() instanceof Detritus){
					Detritus d = (Detritus)e.getSource();
					// TODO Auto-generated method stub
					if(d.isAccesible())
						d.setVisible(false);
					else
						System.out.println("lol");
				}
				
			}
		});
		
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