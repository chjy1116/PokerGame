import java.awt.BorderLayout;
import java.awt.Point;

import javax.swing.*;

public class Help extends JFrame{
	
	Rule rule;
	
	Help() {
		super("HELP");
	
		rule = new Rule();
		add(rule, BorderLayout.CENTER);
		
		this.setLocation(new Point(500, 50));
		setSize(800, 900);
		
		setVisible(true);
		setResizable(false);
	}
}
