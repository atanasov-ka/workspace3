package com.angelock.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6402648412116049978L;
	public void start()
	{
		JLabel l = new JLabel(); 
		l.setText("Anurag jain(csanuragjain)"); 
		add(l); 
		setSize(400,400); 
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main().start();
	}
}
