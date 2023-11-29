package com.uptc.pgr2.proyecto.view.frame.MyMenu;

import javax.swing.JComboBox;

public class LanguageBox extends JComboBox<String> {

	private String[] languageList;

	public LanguageBox(String[] languageList) {
		super();
		this.languageList = languageList;
		init();
	}
	
	private void init() {
		addElements();
	}
	
	private void addElements() {
		for(String i: languageList) {
			this.addItem(i);
		}
	}
	
	
}
