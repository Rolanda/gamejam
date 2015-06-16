package utils;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class JCompPerso extends JPanel{
	private ImageIcon img;
	
	/**
	 * Constructeur
	 */
	public JCompPerso(int profondeur, Image img){
		if(Constante.stackImg.isEmpty())
			Constante.stackImg.put(profondeur, new ArrayList<Image>());
		this.img = img;
		Constante.stackImg.get(profondeur).add(this.img);
	    setPreferredSize(new Dimension(300,400));
	    setSize(300,400);
	    setLayout(null);
	    setOpaque(false);

	}
	
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		for(int profondeur : Constante.stackImg.keySet()){
			for(Image img : Constante.stackImg.get(profondeur)){
				g.drawImage(img, 50, 50, null);
				System.out.println("profondeur " + profondeur + " " + new ImageIcon(img));
			}
		}
	}
	
}
