package tests;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.uptc.pgr2.proyecto.model.MyMovie;
import com.uptc.pgr2.proyecto.persistence.*;

public class TestMovies {
	
	public static void main(String[] args) {

		ReadDirectoryGeneric reader = new ReadDirectoryGeneric("src/resource/fileJson/movies");
		String[] data = reader.readAllSubFiles();
		
		Gson gson = new Gson();
		MyMovie[] movies =  new MyMovie[data.length];
		for(int i=0; i< data.length ;i++) {
			movies[i] = gson.fromJson(data[i], MyMovie.class);
		}
		
		System.out.println("fin...");


	}

}
