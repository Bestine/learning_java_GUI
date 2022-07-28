package MustafaGUI;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		
		JCheckBox checkBox = new JCheckBox();
		checkBox.setText("Are you Mustafa?");
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
}
