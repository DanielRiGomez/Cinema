package com.uptc.pgr2.proyecto.view.frame.MyInformationPanel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MyInformationPanel extends JPanel{

	private UserPanel userPanel;
	private PromotionPanel promotionPanel;
	
	public MyInformationPanel(String userName) {
		super();
		this.userPanel = new UserPanel(userName);
		this.promotionPanel = new PromotionPanel();
		init();
	}
	
	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.CYAN);
		this.setPreferredSize(new Dimension(300, 300));
		
		this.add(userPanel);
		this.add(promotionPanel);
		
	}	

}
