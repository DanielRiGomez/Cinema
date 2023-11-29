package com.uptc.pgr2.proyecto.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * CLase que almacena las peliculas que estan cartelera y los proximos estrenos
 * 
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 1.0
 */
public class MovieBox {

	private ArrayList<MyMovie> premieres;
	private ArrayList<MyMovie> releases;
	
	/**
	 * Metodo constructor que instancia un array de premieres y otro de releases
	 */
	public MovieBox() {
		this.premieres = new ArrayList<>();
		this.releases = new ArrayList<>();
	}

	/**
	 * Metodo que obtiene una lista de peliculas y dependiendo de su fecha las coloca 
	 * en cartelera o en proximos estrenos
	 * @param movies - peliculas a agregar
	 */
	public void addMovie(MyMovie[] movies) {
		LocalDate currentDate = LocalDate.now();
		for(MyMovie i : movies) {
			if((i.getInitDate().isBefore(currentDate) || i.getInitDate().equals(currentDate))
					&& (i.getFinalDate().isAfter(currentDate) || i.getFinalDate().equals(currentDate))) {
				premieres.add(i);
			} else if(i.getInitDate().isAfter(currentDate)) {
				releases.add(i);
			}
		}
	}

	/**
	 * Metodo get de las premieres
	 * @return - peliculas en cartelera
	 */
	public ArrayList<MyMovie> getPremieres() {
		return premieres;
	}

	/**
	 * Metodo get de los releases
	 * @return - proximos estrenos
	 */
	public ArrayList<MyMovie> getComing() {
		return releases;
	}
}
