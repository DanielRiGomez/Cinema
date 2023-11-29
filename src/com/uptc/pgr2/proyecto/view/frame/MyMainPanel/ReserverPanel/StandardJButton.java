package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.ReserverPanel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StandardJButton extends JButton{
	

	private String pathIcon;
	private int size;

	
	public StandardJButton(String pathIcon, int size) {
		super();
		this.pathIcon = pathIcon;
		this.size = size;
		init();
	}

	
	private void init() {
		this.setSize(size, size);
		this.setPreferredSize(new Dimension(size, size));
		changeIcon(pathIcon);
		pressedButton();
		
		this.setBorderPainted(false);
		this.setFocusPainted(false); 
		this.setContentAreaFilled(false);
		this.setOpaque(false);
	}
	
	private void changeIcon(String pathName) {
		ImageIcon icon = new ImageIcon(pathName);
		this.setIcon(new ImageIcon(icon.getImage().getScaledInstance(size, size, Image.SCALE_DEFAULT)));
	}
	
	private void pressedButton() {
		ImageIcon image = (ImageIcon) this.getIcon();
		int width = (int)(size*0.9);
		int height = (int)(size*0.9);
		this.setPressedIcon(new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT)));
	}
	
	public void setListener(ActionListener listener) {
		this.addActionListener(listener);
	}
	
}
