package GameJam;

import java.awt.Graphics;
import java.lang.reflect.Field;

public class Item extends Entity {
	// Coordonnée x
	protected int x;

	// Coordonnée y
	protected int y;

	// Image associé
	protected Sprite sprite;

	// Item interactif
	protected boolean interact = true;

	// Référence de l'item
	private String ref;

	// Texte associé à l'item
	private String txt;

	//Constructeur de base, donne un nom à un item
	public Item(String ref) {
		this.ref = ref;
	}

	//Associe une description à un item
	public void setDescription(String ref) {
		Field f;
		try {
			f = TextZone.class.getField(ref);
			txt = ((TextZone) f.get(null)).val();
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	//Retourne la coordonnée x
	public int getX() {
		return x;
	}

	//Retourne la coordonnée y
	public int getY() {
		return y;
	}
	
	//Dessine le sprite associé à l'item
	public void draw(Graphics g) {
		sprite.draw(g,x, y);
	}
	
	public void move(int dx, int dy) {		
	}

	public void setInteractive() {
	}
	
	public static void main(String[] args) {
		Item test = new Item("pouet");
		test.setDescription("GRILLE");
		System.out.println(test.txt);
	}

	
}
