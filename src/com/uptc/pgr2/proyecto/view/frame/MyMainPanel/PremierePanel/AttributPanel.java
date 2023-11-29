package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.PremierePanel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AttributPanel {

	private JLabel posterFilm;
	private JLabel nameFilm;
	private JLabel dateFilm;
	
	public AttributPanel(String pathPoster, String nameFilm, String dateFilm) {
		super();
		this.posterFilm = new JLabel(new ImageIcon(pathPoster));
		this.nameFilm = new JLabel(nameFilm);
		this.dateFilm = new JLabel(dateFilm);
		init();
	}
	
	private void init() {
		
	}

	public JLabel getPosterFilm() {
		return posterFilm;
	}

	public JLabel getNameFilm() {
		return nameFilm;
	}

	public JLabel getDateFilm() {
		return dateFilm;
	}

	
}
