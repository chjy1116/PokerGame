import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Rule extends JPanel{
	
	private ImageIcon icon_rule = new ImageIcon("rule.png");
	
	Rule() {
		super();
		this.setBackground(Color.BLACK);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(icon_rule.getImage(), 0, 5, this.getWidth(), this.getHeight(), null);
	}
}
