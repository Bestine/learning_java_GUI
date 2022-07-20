package MustafaGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField textField;
	JButton button;

	MyFrame(){
		button = new JButton("submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(150, 30));		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(textField);
		this.add(button);
		
		this.setVisible(true);
		this.setSize(300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String text = textField.getText();
			System.out.println("Hello, " + text);
		}
		
	}
}
