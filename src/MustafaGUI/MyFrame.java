package MustafaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame{
	
	MyFrame(){
		ImageIcon image = new ImageIcon("images/street_analyst.jpeg");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();
		label.setText("Mustafa, the street_analyst");
		label.setIcon(image);
		label.setBounds(0, 0, 80, 80);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setIconTextGap(0);
		label.setBorder(border);
		
		
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
