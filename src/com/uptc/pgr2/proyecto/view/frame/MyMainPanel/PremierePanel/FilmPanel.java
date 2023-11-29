package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.PremierePanel;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilmPanel extends JPanel {
	
	private AttributPanel attri;
	
	public FilmPanel(AttributPanel attributs) {
		super();
		this.attri = attributs;
		init();
	}
	
	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		
		this.add(attri.getPosterFilm());
		this.add(attri.getNameFilm());
		this.add(attri.getDateFilm());
	}
	

}
