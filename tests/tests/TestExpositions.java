package tests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import com.google.gson.Gson;
import com.uptc.pgr2.proyecto.model.Exposition;
import com.uptc.pgr2.proyecto.model.MyMovie;
import com.uptc.pgr2.proyecto.model.model;
import com.uptc.pgr2.proyecto.persistence.ReadDirectoryGeneric;
import com.uptc.pgr2.proyecto.persistence.WriteFileTxtGeneric;
import com.uptc.pgr2.proyecto.view.constant.Constants;

public class TestExpositions {
	
	public static void main(String[] args) {
		/*
		ReadDirectoryGeneric reader = new ReadDirectoryGeneric("src/resource/fileJson/movies");
		String[] data = reader.readAllSubFiles();
		Gson gson = new Gson();
		MyMovie[] movies =  new MyMovie[data.length];
		for(int i=0; i< data.length ;i++) {
			movies[i] = gson.fromJson(data[i], MyMovie.class);
		}
		System.out.println("fin...");
		*/
		
		
		/*
		Gson gson = new Gson();
		byte[] chairs = new byte[79];
		for(int i=0; i< chairs.length;i++)
			chairs[i] =0;
		Exposition expo = new Exposition(LocalDate.now(), LocalTime.now(), "2001", 1, chairs);
		String expoJson =  gson.toJson(expo);
		System.out.println(expoJson);
		*/
		
		model model = new model();	
		ArrayList<Exposition> list = model.getExpositions().movieExpositions("El Abrazo de la Serpiente");
				
		System.out.println("fin..");
		
	}

}
