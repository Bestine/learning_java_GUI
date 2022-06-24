package MustafaGUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	JFrame frame =  new JFrame();
	
	MyFrame(){
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setBackground(Color.RED);
		
		this.setTitle("MustafaGUI");
		this.setSize(750, 750);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(redPanel);
	}

}
