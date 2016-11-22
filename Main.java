import java.awt.Color;

import javax.swing.JFrame;


public class Main {
	public static void main(String[] arg){
		Ball j =new Ball();
		JFrame f = new JFrame();
		f.add(j);
		f.setVisible(true);
		f.setSize(700,700);
		f.setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Modern Art");
		
		
	}
}
