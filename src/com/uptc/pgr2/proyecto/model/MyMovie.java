package com.uptc.pgr2.proyecto.model;

import java.time.LocalDate;

/**
 * Clase que representa una pelicula
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 1.0
 */
public class MyMovie {

	private String originalTitle;
	private String[] cast;
	private String classification;
	private String synopsisKey;
	private String direction;
	private String pathIcon;
	private LocalDate initDate;
	private LocalDate finalDate;
	private boolean inExposition;
	private String fileName;
	
	/**
	 * Metodo costructor de la pelicula que recibe toda la informacion
	 * que se necesita de un pelicula
	 * @param originalTitle - titulo original
	 * @param cast - el reparto
	 * @param synopsisKey - clave del archivo properties donde esta la review
	 * @param classification - una clasificacion de edad
	 * @param direction- el direstor de la pelicula 
	 * @param pathIcon - nombre del archivo imagen de su poster
	 * @param initDate - fecha inicial en la que se permite exponer la pelicula
	 * @param finalDate - fecha final en la que se permiete exponer la pelicula
	 * @param inExposition - se le han asignado unas exposiciones
	 * @param fileName - nombre del archivo Json de la pelicula
	 */
	public MyMovie(String originalTitle, String[] cast, String classification, String direction, String pathIcon,
			LocalDate initDate, LocalDate finalDate, boolean inExposition, String fileName, String synopsisKey) {
		this.synopsisKey = synopsisKey;
		this.originalTitle = originalTitle;
		this.cast = cast;
		this.classification = classification;
		this.direction = direction;
		this.pathIcon = pathIcon;
		this.initDate = initDate; 
		this.finalDate = finalDate;
		this.inExposition = inExposition;
		this.fileName =fileName;
	}

	/**
	 * metodo get del titulo original
	 * @return - titulo original
	 */
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * metodo get de la lista de los nombres de los actores 
	 * @return- lista de los nombres de los actores
	 */
	public String[] getCast() {
		return cast;
	}

	/**
	 * metodo get de la clasificacion de edad
	 * @return - clasificacion de edad
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * metodo get del nombre director
	 * @return
	 */
	public String getDirection() {
		return direction;
	}
	
	/**
	 * metodo get del archivo imagen del poster
	 * @return - nombre del archivo imagen del poster
	 */
	public String getPathIcon() {
		return pathIcon;
	}

	/**
	 * metodo get de la fecha inicial
	 * @return - ficha inicial
	 */
	public LocalDate getInitDate() {
		return initDate;
	}

	/**
	 * metodo get de la fecha final 
	 * @return - fecha final
	 */
	public LocalDate getFinalDate() {
		return finalDate;
	}
	
	/**
	 * metodo get para saber si se le ha asignado alguna exposicion
	 * @return - tiene exposiciones
	 */
	public boolean isInExposition() {
		return inExposition;
	}

	/**
	 * metodo set para decir si esta en exposicion o no
	 * @param inExposition - si tiene o no exposiciones
	 */
	public void setInExposition(boolean inExposition) {
		this.inExposition = inExposition;
	}
	
	/**
	 * metodo get del nombre del archivo Json
	 * @return - nombre del archivo Json
	 */
	public String getFileName() {
		return fileName;
	}

	public String getSynopsisKey() {
		return synopsisKey;
	}

}
