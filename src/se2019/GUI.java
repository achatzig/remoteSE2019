package se2019;

import java.awt.Color;

import javax.swing.*;

public class GUI extends JFrame {
	
	private JPanel panel = new JPanel();
	
	public GUI() {
		
		panel.setBackground(Color.MAGENTA);
		this.setContentPane(panel);
		
		
		this.setVisible(true);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
