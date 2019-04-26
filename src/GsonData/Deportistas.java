package GsonData;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Deportistas {

	public String name;
	public String deporte;
	public String nacionalidad;
	public String imagen;
	public String web;
	public int id;
	public static Deportistas[] deportistas;
	
	
	public static void main(String[] args) {
		try {
			readJSON();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Deportistas[] readJSON() throws FileNotFoundException { 
		
		GsonBuilder builder = new GsonBuilder(); 
	    Gson gson = builder.create(); 										//JSON path
	    BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\deportistas.json"));   
	      
	    deportistas = gson.fromJson(bufferedReader, Deportistas[].class); 
	    System.out.println(deportistas[0].getName());
		return deportistas; 
	}
	
	
	
	public Deportistas() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDeporte() {
		return deporte;
	}


	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public static Deportistas[] getDeportistas() {
		return deportistas;
	}

	public static void setDeportistas(Deportistas[] deportistas) {
		Deportistas.deportistas = deportistas;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
}
