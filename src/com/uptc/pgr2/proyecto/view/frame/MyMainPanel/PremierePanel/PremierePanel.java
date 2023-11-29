package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.PremierePanel;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.google.gson.Gson;

public class PremierePanel extends JPanel{
	
	private JPanel[] films;
	private Gson gson;

	public PremierePanel() {
		super();
		gson = new Gson();
		init();
	}
	
	private void init() {
		this.setLayout(new FlowLayout());	
	}
	
	public void instanceFilmPanels(String filmsJson) {
		AttributPanel[] attributs = gson.fromJson(filmsJson, AttributPanel[].class);
		films = new FilmPanel[attributs.length];
		for(int i=0; i < attributs.length; i++) {
			films[i] = new FilmPanel(attributs[i]);
		}
		fill();
	}
	
	private void fill() {
		for(JPanel i: films) {
			this.add(i);
		}
	}

}
