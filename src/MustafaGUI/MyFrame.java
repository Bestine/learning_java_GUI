package MustafaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{	
	
	JRadioButton vegButton;
	JRadioButton fruitButton;
	JRadioButton saladButton;
	
	MyFrame(){
		vegButton = new JRadioButton();
		vegButton.setText("vegetable");
		vegButton.addActionListener(this);
		
		fruitButton = new JRadioButton();
		fruitButton.setText("fruit");
		fruitButton.addActionListener(this);
		
		saladButton = new JRadioButton();
		saladButton.setText("salad");
		saladButton.addActionListener(this);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(fruitButton);
		buttonGroup.add(vegButton);
		buttonGroup.add(saladButton);

		this.add(fruitButton);
		this.add(vegButton);
		this.add(saladButton);
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vegButton) {
			System.out.println("Ordered vegetables");
		}
		else if(e.getSource()==fruitButton) {
			System.out.println("Ordered fruits");
		}
		else if(e.getSource()==saladButton) {
			System.out.println("Ordered salad");
		}
			
	}
}
