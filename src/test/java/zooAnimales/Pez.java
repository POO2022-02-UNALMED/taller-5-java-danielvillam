package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		super();
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	
	public static int cantidadPeces(){
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad,String genero, Zona zona) {
		salmones++;
		Pez pez = new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
		listado.add(pez);
	}
	
	public void crearBacalao(String nombre, int edad,String genero, Zona zona) {
		bacalaos++;
		Pez pez = new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
		listado.add(pez);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public int getcantidadAletas() {
		return cantidadAletas;
	}
	
	public void setcantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
}
