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
		slider = new JSlider(0, 100, 40);
		slider.setPreferredSize(new Dimension(500, 200));
		slider.addChangeListener(this);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		//slider.setOrientation(JSlider.VERTICAL);
		slider.setOrientation(JSlider.HORIZONTAL);
		
		
		label = new JLabel();
		label.setText(" " + slider.getValue()+"°C");
		label.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		panel = new JPanel();
		panel.add(slider);
		panel.add(label);
		
		frame = new JFrame();
		frame.add(panel);
		frame.setSize(620, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(" " + slider.getValue()+"°C");;
		
	}
	
	

}
