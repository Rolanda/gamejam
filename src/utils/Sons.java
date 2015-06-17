package utils;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.ImageIcon;
/**
 * acces comme Images</br>
 * Sons.CRIE.play()</br>
 * Sons.CRIE.loop()</br>
 * Sons.CRIE.stop()</br>
 * @author Nordic Binary
 *
 */
public class Sons {
	private static AudioClip getAudio(String path){
		URL u = Sons.class.getClass().getResource(path);
		AudioClip audio = Applet.newAudioClip(u);
		return audio;
	}
	
	public static final AudioClip CRIE = getAudio("/son/crie.wav");
}
