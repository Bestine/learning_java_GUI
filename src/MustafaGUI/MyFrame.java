package MustafaGUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	JFrame frame =  new JFrame();
	
	MyFrame(){
		JLabel label = new JLabel();
		label.setText("Mustafa");
		label.setVerticalAlignment(JLabel.BOTTOM);
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setBackground(Color.RED);
		redPanel.setLayout(new BorderLayout());
		redPanel.add(label);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setBackground(Color.BLUE);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setBackground(Color.GREEN);
		
		this.setTitle("MustafaGUI");
		this.setSize(750, 750);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(redPanel);
		this.add(bluePanel);
		this.add(greenPanel);
	}

}
