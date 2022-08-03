package MustafaGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;


public class MyFrame extends JFrame implements ActionListener{	

	JButton button;
	JLabel label;
	
	MyFrame(){		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton();
		button.setText("Select a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("This is the selected color");
		label.setFont(new Font("MV Boli", Font.BOLD, 50));
		
		
		this.add(button);
		this.add(label);
		this.pack();
//		this.setSize(300, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color =colorChooser.showDialog(null, "Pick a color", Color.green);
			
			label.setForeground(color);;
		}
			
	}
}
