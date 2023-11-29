package com.uptc.pgr2.proyecto.view.frame.MyInformationPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserPanel extends JPanel{
	
	private String PATH_USER_ICON ="src//resource//images//icons//userIcon.png";
	
	private JLabel userName;
	private JLabel iconUser;
	
	public UserPanel(String userName) {
		super();
		this.userName = new JLabel(userName);
		//this.iconUser = new JLabel();
		init(userName);
	}
	
	private void init(String userName) {
		this.setLayout(new FlowLayout());
		this.userName = new JLabel();
		loadIcon();
		this.userName.setText(userName);
		this.setSize(new Dimension(25, 100));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(this.userName);
		//this.add(iconUser);
	}
	
	private void loadIcon() {
		ImageIcon icon = new ImageIcon(PATH_USER_ICON);
		userName.setIcon(new ImageIcon(icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
	}
}
