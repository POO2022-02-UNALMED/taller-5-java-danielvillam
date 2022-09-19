package zooAnimales;

import java.util.ArrayList;

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
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos(){
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		Mamifero mamifero = new Mamifero(nombre,edad,"pradera",genero,true,4);
		listado.add(mamifero);
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		leones++;
		Mamifero mamifero = new Mamifero(nombre,edad,"selva",genero,true,4);
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
