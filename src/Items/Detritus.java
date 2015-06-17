package Items;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Images;

@SuppressWarnings("serial")
public class Detritus extends JPanel {
	private boolean accesible;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Detritus(boolean accesible, int x, int y, int width, int height){
		setAccesible(accesible);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
					Detritus d = (Detritus)e.getSource();
					// TODO Auto-generated method stub
					if(d.isAccesible())
						d.setVisible(false);
					else
						System.out.println("lol");							
			}
		});
	}

	@Override
	public void paint(Graphics g){
		//super.paint(g);
		g.drawImage(Images.VERT.getImage(), this.x, this.y, this.width, this.height, null);
	}
		
	public boolean isAccesible(){
		return accesible;
	}

	public void setAccesible(boolean accesible){
		this.accesible = accesible;
	}

}
