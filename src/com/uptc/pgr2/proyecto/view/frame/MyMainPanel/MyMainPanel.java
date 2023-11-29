package com.uptc.pgr2.proyecto.view.frame.MyMainPanel;

import java.awt.Color;

import javax.swing.JPanel;

public class MyMainPanel extends JPanel{
	
	public MyMainPanel() {
		super();
		init();
	}
	
	private void init() {
		this.setBackground(Color.RED);
	}
	
	public void changePanel(JPanel newPanel) {
		this.removeAll();
		this.add(newPanel);
	}

}
