package com.uptc.pgr2.proyecto.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa una exposicion de una pelicula
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 1.0
 */
public class Exposition {

	private LocalDate date;
	private LocalTime hour;
	private String nameMovie;
	private int roomNumber;
	private byte[] chairSet;
	
	/**
	 * Metodo constructor que recibe los datos decesarios de una exposicion
	 * @param date - la fecha 
	 * @param hour - la hora
	 * @param nameMovie - nombre de la pelicula que esta exponiendo
	 * @param roomNumber - numero de la sala
	 * @param chairSet -listado de estados de las sillas; 0 desocupada y 1 ocupada
	 */
	public Exposition(LocalDate date, LocalTime hour, String nameMovie, int roomNumber, byte[] chairSet) {
		this.date = date;
		this.hour = hour;
		this.nameMovie = nameMovie;
		this.roomNumber = roomNumber;
		this.chairSet = chairSet;
	}	

	/**
	 * Metodo que recibe una listado de posiciones de sillas que son reservadas
	 * @param reserve - posiciones de las sillas reservadas
	 */
	public void reserveChair(int[] reserve) {
		for(int i: reserve) {
			chairSet[i] = 1;
		}
	}

	/**
	 * Metodo get de la fecha de exposicion
	 * @return - fecha de exposicion
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Metodo get de la hora de exposicion
	 * @return - hora de exposicion
	 */
	public LocalTime getHour() {
		return hour;
	}

	/**
	 * Metodo get del nombre de la pelicula
	 * @return - nombre de la pelicula
	 */
	public String getNameMoive() {
		return nameMovie;
	}

	/**
	 * Metodo get del listado de sillas
	 * @return - listado de sillas
	 */
	public byte[] getChairSet() {
		return chairSet;
	}

	/**
	 * Metodo get de la sala
	 * @return - sala de exposicion
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((hour == null) ? 0 : hour.hashCode());
		result = prime * result + ((nameMovie == null) ? 0 : nameMovie.hashCode());
		result = prime * result + roomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposition other = (Exposition) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (hour == null) {
			if (other.hour != null)
				return false;
		} else if (!hour.equals(other.hour))
			return false;
		if (nameMovie == null) {
			if (other.nameMovie != null)
				return false;
		} else if (!nameMovie.equals(other.nameMovie))
			return false;
		if (roomNumber != other.roomNumber)
			return false;
		return true;
	}
	
}
