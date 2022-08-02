package MustafaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;


public class MyFrame extends JFrame implements ActionListener{	

	JButton button;
	
	MyFrame(){		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("select");
		button.addActionListener(this);
		
		
		this.add(button);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser  fileChooser = new JFileChooser();
			fileChooser.showOpenDialog(null);
		}
			
	}
}
