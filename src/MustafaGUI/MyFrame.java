package MustafaGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	MyFrame(){
		ImageIcon image = new ImageIcon("images/street_analyst.jpeg");
		
		
		JLabel label = new JLabel();
		label.setText("Mustafa, the street_analyst");
		label.setIcon(image);
		label.setBounds(0, 0, 80, 80);
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.TOP);
		
		
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
