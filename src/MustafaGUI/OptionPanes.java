package MustafaGUI;

import javax.swing.JOptionPane;

public class OptionPanes extends JOptionPane{
	
	OptionPanes() {
		//this.showMessageDialog(null,"Some Useless info","Just A plain Message",JOptionPane.PLAIN_MESSAGE);
		//this.showMessageDialog(null,"Some Useless info","Just an Information Message",JOptionPane.INFORMATION_MESSAGE);
		//this.showMessageDialog(null,"Some Useless Question","Just A Question Message?",JOptionPane.QUESTION_MESSAGE);
//		this.showMessageDialog(null,"Some Useless Warning","Warning!",JOptionPane.WARNING_MESSAGE);
		this.showMessageDialog(null,"Some Useless Error","Syntax Error",JOptionPane.ERROR_MESSAGE);
		
	}

}
