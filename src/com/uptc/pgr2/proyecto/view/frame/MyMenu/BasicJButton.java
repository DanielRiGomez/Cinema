package com.uptc.pgr2.proyecto.view.frame.MyMenu;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BasicJButton extends JButton{
	

	private String name;
	private String tipText;
	private String command;
	
	private final int size= 50;
	
	public BasicJButton(String name, String tipText, String command) {
		super();
		this.name = name;
		this.tipText = tipText;
		this.command = command;
		init();
	}

	private void init() {
		this.setSize(size*2, size);
		//this.setBorderPainted(false);
		this.setFocusPainted(false); 
		this.setContentAreaFilled(false);
		this.setOpaque(false);
		
		this.setText(name);
		this.setToolTipText(tipText);
		this.setActionCommand(command);
	}
	
	public void changeListener(ActionListener listener) {
		this.addActionListener(listener);
	}
}
