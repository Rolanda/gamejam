package GameJam;

import java.awt.Graphics;
import java.awt.Image;

public class Sprite {
	private Image image;
	
	public Sprite(Image img) {
		this.image = img;
	}
	
	public int getWidth() {bn d
		return image.getWidth(null);
	}
	
	public int getHeight() {
		return image.getHeight(null);
	}
	
	void draw(Graphics g, int x, int y) {
		g.drawImage(image, x, y, null);
	}
}
