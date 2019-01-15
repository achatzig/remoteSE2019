package se2019;

import java.awt.Color;

import javax.swing.*;

public class GUI extends JFrame {
	
	private JPanel panel = new JPanel();
	
	public GUI() {
		
		panel.setBackground(Color.RED);
		this.setContentPane(panel);
		
		
		this.setVisible(true);
		this.setTitle("Window Name");
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
