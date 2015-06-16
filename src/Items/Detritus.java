package Items;

import java.awt.Graphics;

import javax.swing.JPanel;

import utils.Images;

@SuppressWarnings("serial")
public class Detritus extends JPanel {
	private boolean accesible;
	private int x;
	private int y;
	
	public Detritus(boolean accesible, int x, int y){
		setAccesible(accesible);
		this.x = x;
		this.y = y;
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		System.out.println(Images.BLEU.getImage());
		g.drawImage(Images.BLEU.getImage(), this.x, this.y, null);
	}
		
	public boolean isAccesible() {
		return accesible;
	}

	public void setAccesible(boolean accesible) {
		this.accesible = accesible;
	}

}
