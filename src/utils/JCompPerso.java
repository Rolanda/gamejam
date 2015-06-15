package utils;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.*;

public class JCompPerso extends JComponent{
	/**
	 * Constructeur
	 */
	public JCompPerso(int profondeur, Image img){
		if(Constante.stackImg.isEmpty())
			Constante.stackImg.put(profondeur, new ArrayList());
		Constante.stackImg.get(profondeur).add(img);
		//this.repaint(); ne repaint pas
	}
	
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		for(int profondeur : Constante.stackImg.keySet()){
			for(Image img : Constante.stackImg.get(profondeur)){
				g.drawImage(img, 50, 50, this);
			}
		}
	}
	
}
