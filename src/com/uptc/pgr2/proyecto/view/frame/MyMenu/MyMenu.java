package com.uptc.pgr2.proyecto.view.frame.MyMenu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.uptc.pgr2.proyecto.view.constant.Command;

public class MyMenu extends JPanel {
	
	private String TEXT_INITIAL_BUTT = "Inicio";
	private String TEXT_PROX_EST_BUTT = "Estrenos";
	private String TIP_INIT_BUTT = "Panel de inicio";
	private String TIP_PROX_EST_BUTT = "PAnel de estrenos";

	private JComboBox<String> languageBox;
	private JButton initialButt;
	private JButton premieresButt;
	
	public MyMenu(String[] languageList) {
		super();
		this.languageBox = new JComboBox<>(languageList);
		init();
	}
	
	private void init() {
		initialButt = new BasicJButton(TEXT_INITIAL_BUTT, TIP_INIT_BUTT, Command.COMMAND_INIT_PANEL);
		premieresButt = new BasicJButton(TEXT_PROX_EST_BUTT, TIP_PROX_EST_BUTT, Command.COMMAND_PREMIERS_PANEL);

		initialButt.setEnabled(false);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.setBackground(Color.BLUE);
		
		this.add(initialButt);
		this.add(premieresButt);
		this.add(languageBox);	
	}
	
	public void addListener(ActionListener listener) {
		initialButt.addActionListener(listener);
		premieresButt.addActionListener(listener);
	}

	public JComboBox<String> getLanguageBox() {
		return languageBox;
	}

	public JButton getInitialButt() {
		return initialButt;
	}

	public JButton getPremieresButt() {
		return premieresButt;
	}
	
	
}
