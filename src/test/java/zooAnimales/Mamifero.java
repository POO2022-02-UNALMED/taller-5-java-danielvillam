package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		super();
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos(){
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		caballos++;
		Mamifero mamifero = new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
		listado.add(mamifero);
	}
	
	public void crearLeon(String nombre, int edad, String genero, Zona zona) {
		leones++;
		Mamifero mamifero = new Mamifero(nombre,edad,"selva",genero,zona,true,4);
		listado.add(mamifero);
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas=patas;
	}
}
