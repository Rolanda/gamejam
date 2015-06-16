package utils;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class RSTJPanel extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Rectangle> li;
	
	public RSTJPanel(int profondeur, Image img) 
	{
		if(Constante.stackImg.isEmpty())
			Constante.stackImg.put(profondeur, new ArrayList());
		Constante.stackImg.get(profondeur).add(img);
		
		//li = new ArrayList<Rectangle>();
	}
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, getMaximumSize().width, getMaximumSize().height);
		g2d.setColor(Color.BLUE);		
	}
	
	void add_rect(Rectangle r)
	{
		li.add(r);
		System.out.println(r+"crée");
	}
	
	void del_rect(Point p)
	{
		for (int i =0;i<li.size();i++)
		{
			
			if(li.get(i).contains(p))
			{
				System.out.println(li.get(i)+"suprimé");
				li.remove(i);
			}
		}
	}

	 Rectangle rect_contien(Point p) 
	 {
		for (Rectangle r : li) 
		{
			if(r.contains(p))
			{
				return r;
			}
		}
		return null;
	}
	
}
