package com.uptc.pgr2.proyecto.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTxtGeneric {

	private File file;
	private FileWriter writer;
	private BufferedWriter buffer;

	public WriteFileTxtGeneric(String pathName) {
		file = new File(pathName);
	}
	
	private void init(boolean access) {
		try {
			writer = new FileWriter(file, access);
			buffer = new BufferedWriter(writer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void overwrite(String message) {
		write(message, true);
	}
	
	public void rewrite(String message) {
		write(message, false);
	}
	
	private void write(String message, boolean access) {
		try {
			init(access);
			if(access) {
				buffer.newLine();
			}
			buffer.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			buffer.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
