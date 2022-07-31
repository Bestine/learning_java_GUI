package MustafaGUI;

import java.awt.*;
import javax.swing.*;

public class ProgressBar {
	
	JFrame frame;
	JProgressBar bar;
	
	
	ProgressBar() {
		bar = new JProgressBar(0, 100);
		bar.setForeground(Color.GREEN);
		bar.setBackground(Color.BLACK);
		bar.setPreferredSize(new Dimension(300, 50));
		bar.setStringPainted(true);
		
		
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(bar, BorderLayout.NORTH);
		frame.setVisible(true);
		
		fillBar();
	}
	public void fillBar() {
		int count = 0;
		while(count<=100) {
			
			bar.setValue(count);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			count +=1;
		}
	}
}
