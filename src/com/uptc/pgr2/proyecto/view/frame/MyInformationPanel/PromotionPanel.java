package com.uptc.pgr2.proyecto.view.frame.MyInformationPanel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PromotionPanel extends JPanel{

	
	
	public PromotionPanel() {
		super();
		init();
	}

	private void init() {
		this.setSize(new Dimension(200, 100));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setBackground(Color.CYAN);
	}
	
}
