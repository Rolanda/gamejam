package Items;

import javax.swing.ImageIcon;

import utils.Constante;

@SuppressWarnings("serial")
public class Ramasable extends Item
{

	public Ramasable(String nom, ImageIcon img, int x,int y, int width, int height) 
	{
		super(nom, img, x, y, width, height);
	}
	
	public void action(Item item)
	{
		item.setVisible(false);
		utils.Constante.inventaire.add(item);
		
		System.out.println(Constante.inventaire);
	}
}
