package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios(){
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad,String genero, Zona zona) {
		ranas++;
		Anfibio anfibio = new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
		listado.add(anfibio);
	}
	
	public void crearSalamandra(String nombre, int edad,String genero, Zona zona) {
		salamandras++;
		Anfibio anfibio = new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
		listado.add(anfibio);
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel=colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso=venenoso;
	}
}
