package MustafaGUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	MyFrame(){
		JLabel label = new JLabel();
		label.setText("Mustafa, do you even code?");
		
		
		JFrame frame =  new JFrame();
		this.setTitle("MustafaGUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
		this.setSize(420, 420);
		
		// add the components 
		this.add(label);
		
	}

}
