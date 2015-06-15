package niveaux;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;

import utils.*;
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
		/*
		JPanel decor = new JPanel();
		decor.setBackground(Color.ORANGE);
		decor.setBounds(0,0, Constante.ECRANX, Constante.ECRANY);
		decor.repaint();
		
		
		fenetre.add(decor);*/
		
		JCompPerso compperso = new JCompPerso(0, new ImageIcon("img/lvl1/rouge.jpg").getImage());
		compperso.repaint();
		
		fenetre.add(compperso);
		
		
		
		
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
