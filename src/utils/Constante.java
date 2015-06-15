package utils;


import java.awt.Image;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Constante {
	public static final int ECRANX = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static final int ECRANY= (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();

	
	public static Map<Integer, List<Image>> stackImg = new HashMap<Integer, List<Image>>();
	
}
