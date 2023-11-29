package com.uptc.pgr2.proyecto.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDirectoryGeneric {

	private File file;
	private FileReader reader;
	private BufferedReader buffer;

	public ReadDirectoryGeneric(String pathName) {
		file = new File(pathName);
	}
	
	private void init(File fileToReader) {
		try {
			reader = new FileReader(fileToReader);
			buffer = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private String allInALine(){
		String all = "";
		String line = "";
		try {
			while((line = buffer.readLine()) !=null) {
					all+=line;
			}
		} catch (IOException e) {
				e.printStackTrace();	
		}
		return all;
	}
	
	public String[] readAllSubFiles() {
		File[] subFiles = file.listFiles();
		String[] data = new String[subFiles.length];
		for(int i=0; i< subFiles.length; i++) {
			if(subFiles[i].isFile()) {
				init(subFiles[i]);
				data[i] = allInALine();
			}
		}
		if(buffer !=null && reader != null)
		    close();
		return data;
	}
	
	public void close() {
		try {
			buffer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
