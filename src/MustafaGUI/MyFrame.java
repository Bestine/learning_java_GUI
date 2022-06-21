package MustafaGUI;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
//		JFrame frame =  new JFrame("MustafaGUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setTitle("Mustafa GUI");
		this.getContentPane().setBackground(Color.red);
		this.setSize(420, 420);
		this.setVisible(true);
	}

}
