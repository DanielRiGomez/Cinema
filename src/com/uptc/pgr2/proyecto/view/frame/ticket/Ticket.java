package com.uptc.pgr2.proyecto.view.frame.ticket;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JWindow;

/**
 * Clase que maneja la ventada que se mostrara com tiquete
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 0.1
 */
public class Ticket extends JWindow{
	
	private final int height = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2);
	private final int width = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2);
	private final String PATH_BACKGROUND_TICKET = "src/resource/images/pictures/ticket.jpg";
	private final Font FONT_TITLE = new Font("Arial", Font.CENTER_BASELINE, 30);
	private final Font FONT_TEXT = new Font("Arial", Font.CENTER_BASELINE, 20);
	
	private ImageIcon background;
	private String nameMovie;
	private String date;
	private String hour;
	private String room;
	private String nameUser;
	private int[] chairs;

	/**
	 * Metodo constructor que recibe los datos necesarios para un tiquete
	 * @param nameMovie - nombre de la pelicula 
	 * @param date - fecha
	 * @param hour - hora
	 * @param room - sala
	 * @param nameUser - nombre de usuario
	 * @param chairs - listado de sillas reservadas
	 */
	public Ticket(String nameMovie, String date, String hour, String room, String nameUser, int[] chairs) {
		super();
		this.nameMovie = nameMovie;
		this.date = date;
		this.hour = hour;
		this.room = room;
		this.nameUser = nameUser;
		this.chairs = chairs;
		background = new ImageIcon(PATH_BACKGROUND_TICKET);
		init();
	}
	
	/**
	 * Metodo que le da las caracteristicas 
	 */
	private void init() {
		this.setSize(width, height);
		this.setLocation((int)(width*0.5), (int)(height*0.5));
	}
	
	/**
	 * Metodo que mustra una fraccion de tiempo la ventana
	 * @param time - tiempo en mili-segundos que mostrara la ventana
	 */
	public void showSplashAMoment(long time) {
		this.setVisible(true);
		try {
			Thread.sleep(time);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setVisible(false);
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, width, height, this);
		
		g.setFont(FONT_TITLE);	
		g.drawString(nameMovie, width/5, height/5);
		
		g.setFont(FONT_TEXT);
		g.drawString(date+" - "+hour+" - "+room, width/5, height/3);
		g.drawString(nameUser, width/5, height/2);		
		g.drawString(listChairs(), width/5,height - height/3);
	}

	/**
	 * Metodo que crea un string con la lista de sillas reservadas
	 * @return - String con el listado de sillas reservadas
	 */
	private String listChairs() {
		String list = "";
		for(int i=0; i < chairs.length; i++ ) {
			if(i!=0) {
				list += "-";
			}
			list += Integer.toString(chairs[i]);
		}
		
		return list;
	}

}
