package MustafaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{	
	
	JComboBox comboBox;
	
	MyFrame(){
		String[] vegetables = {"spinach", "tomato", "cabbage"};

		comboBox = new JComboBox(vegetables);
		comboBox.addActionListener(this);
//		comboBox.setEditable(true);
//		comboBox.removeAllItems();
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(comboBox);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}
}
