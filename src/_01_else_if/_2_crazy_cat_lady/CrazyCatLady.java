
package _01_else_if._2_crazy_cat_lady;

import javax.swing.JOptionPane;
import java.net.URI;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String quantity = JOptionPane.showInputDialog("how many cats do you have?");
		// 2. Convert their answer into an int
		int cats = Integer.parseInt(quantity);
		if( cats >= 3 ) {
			JOptionPane.showMessageDialog(null, "you are a crazy cat lady ^. .^");
		} else if ( cats <3 && cats >0 ) {
			JOptionPane.showMessageDialog(null, "you are a cat lover! <3");
		}
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

