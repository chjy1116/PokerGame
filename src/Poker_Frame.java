import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Poker_Frame extends JFrame {

	SetUp_Panel setup;

	Poker_Frame() {
		super("WIN POKER");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400, 900);
		
		setup = new SetUp_Panel();
		add(setup, BorderLayout.CENTER);

		
		setVisible(true);
		setResizable(false);
	}
}
