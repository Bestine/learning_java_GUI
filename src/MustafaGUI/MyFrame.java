package MustafaGUI;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		JFrame frame =  new JFrame();
		this.setTitle("MustafaGUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
		this.setSize(3840, 2160);
	}

}
