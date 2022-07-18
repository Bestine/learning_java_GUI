package MustafaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	MyFrame(){
		//create JPanels
		JPanel panel1 =  new JPanel();
		JPanel panel2 =  new JPanel();
		JPanel panel3 =  new JPanel();
		JPanel panel4 =  new JPanel();
		JPanel panel5 =  new JPanel();
		
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.red);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.yellow);
		
		panel1.setVisible(true);
		panel2.setVisible(true);
		panel3.setVisible(true);
		panel4.setVisible(true);
		panel5.setVisible(true);
		
		this.setResizable(true);
		this.setTitle("Border Layout Frame");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new BorderLayout());
		//Add the panels to the Frame
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.SOUTH);
		this.add(panel3, BorderLayout.EAST);
		this.add(panel4, BorderLayout.WEST);
		this.add(panel5, BorderLayout.CENTER);
		
	}
}
