package GameJam;

import java.awt.Graphics;

public abstract class Entity {
	protected int x;
	protected int y;
	
	protected Sprite sprite;//image representant l'entite
	protected boolean interactive;//peut cliquer dessus
	
	//Deplacement de l'entite
	public abstract void move(int dx, int dy);
	
	public abstract int getX();
	
	public abstract int getY();
	
	//Devient interactif
	public abstract void setInteractive();
	
	//Dessine le sprite correspondant
	public abstract void draw(Graphics g);
}
