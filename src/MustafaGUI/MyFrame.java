package MustafaGUI;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyFrame extends JFrame{

	MyFrame(){
		JLabel label1 = new JLabel();
		label1.setBounds(50, 50, 200, 200);
		label1.setBackground(Color.RED);
		label1.setOpaque(true);
		
		JLabel label2 = new JLabel();
		label2.setBounds(100, 100, 200, 200);
		label2.setBackground(Color.GREEN);
		label2.setOpaque(true);
		
		JLabel label3 = new JLabel();
		label3.setBounds(150, 150, 200, 200);
		label3.setBackground(Color.BLUE);
		label3.setOpaque(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		layeredPane.add(label1);
		layeredPane.add(label2);
		layeredPane.add(label3);
		
		this.setLayout(null);
		this.add(layeredPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
