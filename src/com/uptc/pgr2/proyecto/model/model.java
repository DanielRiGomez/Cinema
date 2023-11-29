package com.uptc.pgr2.proyecto.model;

import com.google.gson.Gson;
import com.uptc.pgr2.proyecto.persistence.ReadDirectoryGeneric;
import com.uptc.pgr2.proyecto.persistence.WriteFileTxtGeneric;
import com.uptc.pgr2.proyecto.view.constant.Constants;

/**
 * Clase que maneja la informacion de las peliculas de quenemos en la base de datos y las exposiciones
 * de las mismas
 * 
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 1.0
 */
public class model {

	private MovieBox movies;
	private ExpositionSet expositions;
	private Gson gson;
	
	/**
	 * Metodo constructor que instacia los atributos y inicializa sus valores
	 */
	public model() {
		this.movies = new MovieBox();
		this.expositions = new ExpositionSet();
		gson = new Gson();
		init();
	}
	
	/**
	 * Metodo que llama a diversos metodos para instanciar todas las peliculas, exposiciones y asignarles
	 * unas exposiciones a las peliculas que lo necesiten 
 	 */
	private void init() {
		instanceMovies();
		instanceExpositions();
		movieInExposition();
	}
	
	/**
	 * Metodo que va al directorio donde estan todos los archivos de las peliculas, los lee, crea las
	 * clases MyMovie a partir de la informacion de cada archivo y envia esa lista de MyMovie a 
	 * MovieBox para que los registre. 
	 */
	private void instanceMovies() {
		String[] moviesJson =  new ReadDirectoryGeneric(Constants.PATH_MOVIES).readAllSubFiles();
		MyMovie[] moviesSet = new MyMovie[moviesJson.length];
		for(int i=0; i<moviesJson.length; i++) {
			moviesSet[i] = gson.fromJson(moviesJson[i], MyMovie.class);
		}
		movies.addMovie(moviesSet);
	}
	
	/**
	 * Metodo que va al directorio donde estan todos los archivos de las exposiciones de cada pelicual, 
	 * los lee, crea las clases Exposition a partir de la informacion de cada archivo y envia esa lista
	 * de Exposition a ExpositionSet para que los registre.
	 */
	private void instanceExpositions() {
		String[] expoJson =  new ReadDirectoryGeneric(Constants.PATH_EXPOSITIONS).readAllSubFiles();
		Exposition[] expoSet = new Exposition[expoJson.length];
		for(int i=0; i<expoJson.length; i++) {
			expoSet [i] =gson.fromJson(expoJson[i], Exposition.class);
		}
		expositions.addExposition(expoSet);
	}
	
	/**
	 * Metodo que revisa las peliculas que esten en cartelera pero que no se les haya asignado 
	 * unas presentaciones y llama a la clase ExpositionSet para crearlas
	 */
	private void movieInExposition() {
		for(MyMovie i: movies.getPremieres()) {
			if(!i.isInExposition()) {
				i.setInExposition(true);
				writeMovies(i);
				Exposition[] newExpos = expositions.newExposition(i.getOriginalTitle(), i.getInitDate(), i.getFinalDate());
				for(Exposition j: newExpos)
				    writeExpositions(j);
			}
		}
	}
	
	/**
	 * Metodo que recibe una clase Exposition y crea un archivo json de la clase
	 * @param expo - exposicion
	 */
	public void writeExpositions(Exposition expo) {
		String nameFile = "/"+expo.getDate()+";"+expo.getHour().getHour()+expo.getRoomNumber()+".json";
		WriteFileTxtGeneric writer = new WriteFileTxtGeneric(Constants.PATH_EXPOSITIONS + nameFile);
		String text = gson.toJson(expo);
		writer.rewrite(text);
		writer.close();
	}
	
	/**
	 * Metodo que recibe una clase MyMovie y crea un archivo json de la clase
	 * @param movie - pelicula
	 */
	private void writeMovies(MyMovie movie) {
		WriteFileTxtGeneric writer = new WriteFileTxtGeneric(Constants.PATH_MOVIES +"/"+ movie.getFileName());
		String text = gson.toJson(movie);
		writer.rewrite(text);
		writer.close();
	}

	/**
	 * Metodo get del atributo movies
	 * @return - peliculas 
	 */
	public MovieBox getMovies() {
		return movies;
	}

	/**
	 * Metodo get de las exposiciones
	 * @return - exposiciones
	 */
	public ExpositionSet getExpositions() {
		return expositions;
	}
}
