package utils;

import java.net.URL;

import javax.swing.ImageIcon;

public class Images 
{
	private static ImageIcon getImg(String str)
	{
		URL url = Images.class.getResource(str);
		return new ImageIcon(url);
	}
	public static final ImageIcon BLEU = getImg("/img/lvl1/bleu.jpg");
	public static final ImageIcon VERT = getImg("/img/lvl1/vert.jpg");
	public static final ImageIcon ROUGE = getImg("/img/lvl1/rouge.jpg");
	
	
}


