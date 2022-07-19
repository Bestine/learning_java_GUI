package MustafaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage extends JFrame implements ActionListener{
	JButton launchButton;
	
	LaunchPage() {
		
		launchButton = new JButton();
		launchButton.setText("New Window");
		launchButton.setFocusable(false);
		launchButton.setBounds(80, 110, 150, 30);
		launchButton.addActionListener(this);		
		
		this.add(launchButton);
		
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==launchButton) {
			this.dispose();
			NewWindow window = new NewWindow();
		}
	}
}
