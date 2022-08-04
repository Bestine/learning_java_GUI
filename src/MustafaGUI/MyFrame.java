package MustafaGUI;

import javax.swing.JFrame;

public class MyFrame extends JFrame{	
	
	MyFrame(){
		
		DragPanel dragPanel = new DragPanel();
		
		this.add(dragPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
}
