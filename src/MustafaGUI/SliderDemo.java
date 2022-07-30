package MustafaGUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	
	JSlider slider;
	JLabel label;
	JPanel panel;
	JFrame frame;
	
	SliderDemo() {
		
		frame.setSize(600, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
