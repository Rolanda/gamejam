package GameJam;

import java.util.HashMap;

public class SpriteSheet {
	private static SpriteSheet spriteS = new SpriteSheet() ;
	private HashMap sprite ;
	
	public Sprite getSprite(String ref) {
		return null ;
	}
	
	public static SpriteSheet get() {
		return spriteS ;
	}
	
	private void fail(String msg) {
		System.err.print(msg);
		System.exit(0);
	}
}
