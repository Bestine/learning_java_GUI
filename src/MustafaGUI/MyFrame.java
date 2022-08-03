package MustafaGUI;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MyFrame extends JFrame implements MouseListener{	

	JLabel label;
	
	MyFrame(){		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		label = new JLabel();
		label.setBounds(250, 400, 60, 60);
		label.setBackground(Color.green);
		label.setOpaque(true);
		label.addMouseListener(this);
		

		this.add(label);
		this.getContentPane().setBackground(Color.black);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You just clicked label");
		label.setBackground(Color.red);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You just entered label");
		label.setBackground(Color.white);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You just exited label");
		label.setBackground(Color.green);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You just pressed label");	
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
