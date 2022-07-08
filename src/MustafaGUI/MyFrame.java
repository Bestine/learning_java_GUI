package MustafaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	
	JFrame frame =  new JFrame();
	JButton button;
	
	MyFrame(){
		button = new JButton();
		button.setBounds(70, 70, 200, 100);
		button.addActionListener(this);
		button.setText("Hello Mustafa");
		button.setFocusable(false);
		
		this.setTitle("MustafaGUI");
		this.setSize(350, 350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println("Hello Mustafa");
		}
	}

}
