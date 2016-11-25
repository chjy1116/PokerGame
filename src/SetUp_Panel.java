import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class SetUp_Panel extends JPanel implements ActionListener, FocusListener {
	private ImageIcon icon_back = new ImageIcon("poker.jpg");
	private ImageIcon icon_start = new ImageIcon("start.png");
	private ImageIcon icon_help = new ImageIcon("help1.png");
	private ImageIcon icon_card = new ImageIcon("Cards.gif");

	private JButton btn_help;
	private JButton btn_go;
	private JLabel label_start;
	public JTextField tf_name;

	Font font = new Font("Serif", Font.BOLD, 40);
	Font font1 = new Font("Serif", Font.BOLD, 25);
	
	public SetUp_Panel() {
		super();
		this.setLayout(null);

		btn_help = new JButton(icon_help);
		btn_help.setLocation(1320, 20);
		btn_help.setSize(50, 50);
		btn_help.setBorderPainted(false);
		btn_help.setBackground(new Color(255,255,255));
		btn_help.setOpaque(false);
		btn_help.addActionListener(this);
		
		btn_go = new JButton("GO!!!");
		btn_go.setLocation(330, 670);
		btn_go.setSize(150, 40);
		btn_go.setBorderPainted(false);
		btn_go.setBackground(new Color(254,254,254));
		btn_go.setForeground(Color.WHITE);
		btn_go.setFont(font);
		btn_go.setOpaque(false);
		btn_go.addActionListener(this);
		
		tf_name = new JTextField();
		tf_name.setText("NickName");
		tf_name.setFont(font1);
		tf_name.setForeground(Color.LIGHT_GRAY);
		tf_name.setBounds(130, 670, 200, 40);
		tf_name.setFocusable(true);
		tf_name.addFocusListener(this);
		
		this.add(btn_help);
		this.add(btn_go);
		this.add(tf_name);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(icon_back.getImage(), 0, 0, getWidth(), getHeight(), this);
		g.drawImage(icon_start.getImage(), 50, 200, 500, 410, this);
		g.drawImage(icon_card.getImage(), 1200, 130, 190, 170, this);

		g.setColor(Color.WHITE);
		g.drawRoundRect(345, 665, 120, 50, 60, 50);
		Font font = new Font("JokerMan", Font.CENTER_BASELINE, 50);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("WIN", 710, 100);

		font = new Font("JokerMan", Font.ITALIC, 130);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("POKER", 750, 250);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_go) {
			JPanel p = (JPanel) btn_go.getParent();
			Container c = btn_go.getTopLevelAncestor();
			
			p.removeAll();
			c.remove(p);
			p.setVisible(false);
			c.add(new Game_Panel());
			
			c.setVisible(true);
		}
		else if(e.getSource() == btn_help) {
			new Help();
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == tf_name) {
			tf_name.setText("");
			tf_name.setForeground(Color.BLACK);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
	}
}
