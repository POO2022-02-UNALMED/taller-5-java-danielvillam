package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		super();
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	
	public static int cantidadReptiles(){
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad,String genero, Zona zona) {
		iguanas++;
		Reptil reptil = new Reptil(nombre,edad,"humedal",genero,zona,"verde",3);
		listado.add(reptil);
	}
	
	public void crearSerpiente(String nombre, int edad,String genero, Zona zona) {
		serpientes++;
		Reptil reptil = new Reptil(nombre,edad,"jungla",genero,zona,"blanco",1);
		listado.add(reptil);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
}
