package niveaux;

import java.awt.Dimension;
import javax.swing.JFrame;
import utils.Constante;
import utils.Images;
import Items.Item;
import Items.Ramasable;
public class Niveau1 
{
	private JFrame fenetre;
	
	Niveau1()
	{
		fenetre = new JFrame("Gamejam");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(Constante.ECRANX, Constante.ECRANY));
		fenetre.setLayout(null);
		
		Item it1 = new Ramasable("item1",Images.BLEU, 150, 150,50,50);
		fenetre.getContentPane().add(it1);
		
		
		Item it2 = new Ramasable("item2",Images.VERT, 170, 170,50,50);
		fenetre.getContentPane().add(it2);
		
		Item it3 = new Ramasable("item3",Images.ROUGE, 180, 150,50,50);
		fenetre.getContentPane().add(it3);
		
		
		fenetre.setResizable(false);
		fenetre.pack();
		fenetre.setVisible(true);
		
	}
	
	public static void main(String[] arg)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				new Niveau1();
			}
		});
	}
}
