package MustafaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{	
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;

	MyFrame(){		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		loadItem  = new JMenuItem("Load");
		loadItem.addActionListener(this);
		saveItem  = new JMenuItem("Save");
		saveItem.addActionListener(this);
		exitItem  = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("You just loaded");
		}
		if(e.getSource()==saveItem) {
			System.out.println("You just saved");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}
}
