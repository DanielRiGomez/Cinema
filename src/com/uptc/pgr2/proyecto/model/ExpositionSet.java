package com.uptc.pgr2.proyecto.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que almacela todas las exposiciones
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 1.0
 */
public class ExpositionSet {
	
	private final int EXPOSITIONS_FOR_MOVIE = 2;
	
	private ArrayList<Exposition> expositions;
	
	/**
	 * Metodo constructor que instancia el arreglo de exposiciones
	 */
	public ExpositionSet() {
		this.expositions = new ArrayList<>();
	}

	/**
	 * Metodo que recibe una lista de exposiciones y las agrega si aun no se
	 * ha realizado la exposicion
	 * @param expositions
	 */
	public void addExposition(Exposition[] expositions) {
		LocalDate currentDate = LocalDate.now();
		for(Exposition i: expositions) {
			if(i.getDate().isAfter(currentDate) || i.getDate().equals(currentDate)) {
				this.expositions.add(i);
			}
		}
	}

	/**
	 * Metodo que revisa si una un nombre de una pelicula las ver si esta en exposicion
	 * @param nameMovie - nombre de la pelicula a buscar
	 * @return - flase si no esta en exposicion y true si esta
	 */
	public boolean searchMovie(String nameMovie) {
		boolean inPremiere = false;
		for(Exposition i: expositions) {
			inPremiere = i.getNameMoive().equals(nameMovie)?true:inPremiere;
		}
		return inPremiere;
	}
	
	/**
	 * Metodo que devuelve las exposiciones que tenga una pelicula
	 * @param nameMovie - nombre de la pelicula 
	 * @return - lista de exposiciones que tiene la pelicula
	 */
	public ArrayList<Exposition> movieExpositions(String nameMovie) {
		ArrayList<Exposition> movieExpos = new ArrayList<>();
		for(Exposition i: expositions) {
			if(i.getNameMoive().equals(nameMovie))
				movieExpos.add(i);
		}
		return movieExpos;
	}
	
	/**
	 * Metodo que crea una lista de exposiciones teniendo el nombre de la pelicula y un intervalo
	 * de tiempo
	 * @param nameMovie - Nombre de la pelicula
	 * @param initDate - fecha inicial en la que se permite exponer la pelicula
	 * @param finalDate -fecha final en la que se permiete exponer la pelicula
	 * @return - lista de exposiciones
	 */
	public Exposition[] newExposition(String nameMovie, LocalDate initDate, LocalDate finalDate) {
		Exposition[] newExpos = new Exposition[EXPOSITIONS_FOR_MOVIE];
		int days = (int) ChronoUnit.DAYS.between(initDate, finalDate);
		for(int i=0; i < EXPOSITIONS_FOR_MOVIE; i++) {
			Exposition newExpo = aleatoryExpo(nameMovie, initDate, days);
			if(!expositions.contains(newExpo)) {
				newExpos[i]=newExpo;
			}else {
				i--;
			}
		}
		this.addExposition(newExpos);
		return newExpos;
	}
	
	/**
	 * Metodo que crea una exposicion al azar 
	 * @param nameMovie - nombre de la pelikcula
	 * @param initDate - fecha de inicio
	 * @param days - dias que estara en exposicion
	 * @return
	 */
	private Exposition aleatoryExpo(String nameMovie, LocalDate initDate, int days) {
		int day = new Random().nextInt(days);
		int hour = new Random().nextInt(5);
		int room = new Random().nextInt(4);
		byte[] chairs = new byte[80];
		Exposition newExpo = new Exposition(initDate.plusDays(day), 
				LocalTime.of((9+(hour*3)),0), nameMovie, room, chairs);
		return newExpo;
	}

	/**
	 * Metodo get de las exposiciones
	 * @return - exposiciones
	 */
	public ArrayList<Exposition> getExpositions() {
		return expositions;
	}

}
