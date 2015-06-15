package niveaux;

import java.awt.Dimension;

import javax.swing.*;

import utils.Constante;

public class Niveau1 {
	private JFrame fenetre;
	
	Niveau1(){
		fenetre = new JFrame("Gamejam");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(Constante.ECRANX, Constante.ECRANY));
		fenetre.setLayout(null);
		
		
		
		
		fenetre.setResizable(false);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
