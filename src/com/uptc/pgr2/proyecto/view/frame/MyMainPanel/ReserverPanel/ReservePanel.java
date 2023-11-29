package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.ReserverPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ReservePanel extends JPanel{

	private ChairSetPanel chairSet;
	private OptionReservePanel optionsPanel;
	
	public ReservePanel(byte[] dataChair, String filmName, String  filmDate, String filmHour, String filmRoom) {
		super();
		this.chairSet = new ChairSetPanel(dataChair);
		this.optionsPanel = new OptionReservePanel(filmName, filmDate, filmHour, filmRoom);
		init();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		
		this.add(chairSet, BorderLayout.CENTER);
		this.add(optionsPanel, BorderLayout.EAST);
	}

	public ChairSetPanel getChairSet() {
		return chairSet;
	}

	public OptionReservePanel getOptionsPanel() {
		return optionsPanel;
	}
	
	public void addListenerPanel(ActionListener listener) {
		chairSet.addListener(listener);
		optionsPanel.addListener(listener);
	}
}
