package com.uptc.pgr2.proyecto.view.splash;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase del panel principal del splash
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 0.1
 */
public class MainPanelSplash extends JPanel {

	private final String PATH_BACKGROUND = "src/resource/images/pictures/backgroundSplash.jpg";
	private final String PATH_CINEMAICON = "src/resource/images/pictures/judaFilm.png";
	
	public static final String APP_VERSION = "1.0";
	public static final String APP_DATE = "2021";
	public static final String APP_AUTHOR_DANIEL = "Daniel Ricardo Gomez Gonzalez";

	private ImageIcon background;
	private ImageIcon cinemaIcon;
	
	/**
	 * Metodo constructor que instancia las imagenes de fondo
	 */
	public MainPanelSplash() {
		super();
		background = new ImageIcon(PATH_BACKGROUND);
		cinemaIcon = new ImageIcon(PATH_CINEMAICON);
	}
	

	/**
	 * Metodo que pinta el fondo y los textos
	 */
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2,
				(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2, this);
		
		g.drawImage(cinemaIcon.getImage(), 0, -40, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2,
				(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2, this);
		this.setOpaque(false);
		super.paint(g);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));
		
		g.drawString(APP_VERSION, 10, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 -20);
		g.drawString(APP_DATE, 10, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 -40);
		g.drawString(APP_AUTHOR_DANIEL, 10, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 -60);
	}
	
	
}
