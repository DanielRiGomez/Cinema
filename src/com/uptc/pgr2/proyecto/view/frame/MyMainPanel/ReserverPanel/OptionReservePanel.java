package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.ReserverPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OptionReservePanel extends JPanel {

	private final String PATH_ICON_BUTT_RESERVE = "src/resource/images/icons/ticketIcon.png";
	private final String PATH_ICON_BUTT_BACK = "src/resource/images/icons/returnIcon.png";
	private final String PATH_ICON_RESET = "src/resource/images/icons/resetIcon.png";
	private final int SIZE_BUTTON_OPTION = 80;
	
	private JLabel filmName;
	private JLabel filmDate;
	private JLabel filmHour;
	private JLabel filmRoom;
	private JPanel informPanel;
	private StandardJButton reserveButt;
	private StandardJButton backButt;
	private StandardJButton resetButt;
	private JPanel buttPanel;
	
	public OptionReservePanel(String filmName, String  filmDate, String filmHour, String filmRoom) {
		super();
		informPanel = new JPanel();
		buttPanel = new JPanel();
		this.filmName = new JLabel(filmName, SwingConstants.CENTER);
		this.filmDate = new JLabel(filmDate, SwingConstants.CENTER);
		this.filmHour = new JLabel(filmHour, SwingConstants.CENTER);
		this.filmRoom = new JLabel(filmRoom, SwingConstants.CENTER);
		this.reserveButt = new StandardJButton(PATH_ICON_BUTT_RESERVE, SIZE_BUTTON_OPTION);
		this.backButt = new StandardJButton(PATH_ICON_BUTT_BACK, SIZE_BUTTON_OPTION);
		this.resetButt = new StandardJButton(PATH_ICON_RESET, SIZE_BUTTON_OPTION);
		init();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		createInformPanel();
		createButtPanel();
		this.add(informPanel, BorderLayout.CENTER);
		this.add(buttPanel, BorderLayout.SOUTH);
	}
	
	private void createInformPanel() {
		informPanel.setLayout(new GridLayout(4, 1, 10, 10));
		filmName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		filmDate.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		filmHour.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		filmRoom.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		informPanel.add(filmName);
		informPanel.add(filmDate);
		informPanel.add(filmHour);
		informPanel.add(filmRoom);
	}
	
	private void createButtPanel() {
		buttPanel.setLayout(new BoxLayout(buttPanel, BoxLayout.PAGE_AXIS));
		
		buttPanel.add(reserveButt);
		buttPanel.add(resetButt);
		buttPanel.add(backButt);
	}
	
	public void addListener(ActionListener listener) {
		reserveButt.setListener(listener);
		backButt.setListener(listener);
		resetButt.setListener(listener);
	}
}
