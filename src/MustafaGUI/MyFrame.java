package MustafaGUI;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MyFrame extends JFrame implements KeyListener{	

	JLabel label;
	
	MyFrame(){		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		ImageIcon rocket = new ImageIcon("images/rocket.jpeg");
		
		
		label = new JLabel();
		label.setIcon(rocket);
		label.setBounds(250, 400, 60, 60);
		label.setBackground(Color.black);
		label.setOpaque(true);
		

		this.add(label);
		this.getContentPane().setBackground(Color.black);
		this.addKeyListener(this);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		switch(e.getKeyCode()) {
		// Move left
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
		// Move up
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
		// Move right
		case 39:
			label.setLocation(label.getX()+10, label.getY());
			break;
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released key: " + e.getKeyCode());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		// Move left
		case 'a':
			label.setLocation(label.getX()-10, label.getY());
			break;
		
		// Move up
		case 'w':
			label.setLocation(label.getX(), label.getY()-10);
			break;
		
		// Move right
		case 'd':
			label.setLocation(label.getX()+10, label.getY());
			break;
		
		// Move down
		case 's':
			label.setLocation(label.getX(), label.getY()+10);
			break;
			
		}
	}

}
