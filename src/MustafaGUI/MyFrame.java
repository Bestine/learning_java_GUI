package MustafaGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	
	JTextField textField;

	MyFrame(){
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(150, 30));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(textField);
		this.setVisible(true);
		this.setSize(300, 300);
	}
}
