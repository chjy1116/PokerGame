import java.awt.*;

import javax.swing.*;

public class Game_Panel extends JPanel{
	
	private ImageIcon back_icon = new ImageIcon("back.jpg");
	Game_Panel() {
		super();
		setLayout(new GridLayout(6, 5));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(back_icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	}
}
