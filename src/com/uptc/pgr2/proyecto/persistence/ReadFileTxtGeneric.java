package com.uptc.pgr2.proyecto.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileTxtGeneric {

	private File file;
	private FileReader reader;
	private BufferedReader buffer;

	public ReadFileTxtGeneric(String pathName) {
		file = new File(pathName);
		init(file);
	}
	
	private void init(File fileToReader) {
		try {
			reader = new FileReader(fileToReader);
			buffer = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String readLine() {
		String line = "";
		try {
			line = buffer.readLine();
		} catch (IOException e) {
				e.printStackTrace();	
		}
		return line;
	}
	
	public String allInALine(){
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
	
	public void close() {
		try {
			buffer.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
