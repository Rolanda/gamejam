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

	// Objet interactif
	protected boolean interact = true;

	// Référence de l'objet
	private String ref;

	// Texte associé à l'item
	private String txt;

	public Item(String ref) {
		this.ref = ref;
	}

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

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public static void main(String[] args) {
		Item test = new Item("pouet");
		test.setDescription("GRILLE");
		System.out.println(test.txt);
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInteractive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
