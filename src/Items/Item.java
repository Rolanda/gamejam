package Items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class Item extends JButton 
{

	public Item(String nom,ImageIcon img, int x, int y,int width,int height)
	{
		super(img);
		this.setName(nom);
		this.setBounds(x, y, width, height);
		this.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				((Item) arg0.getSource()).action((Item) arg0.getSource());
			}
		});
		
		this.setFocusable(false);
		this.setBorderPainted(false);
	}

	public abstract void action(Item item);
	
	@Override
	public String toString() 
	{
		
		return ""+this.getName();
	}
	
}
