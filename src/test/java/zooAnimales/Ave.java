package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super();
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves(){
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad,String genero, Zona zona) {
		halcones++;
		Ave ave = new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
		listado.add(ave);
	}
	
	public void crearAguila(String nombre, int edad,String genero, Zona zona) {
		aguilas++;
		Ave ave = new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
		listado.add(ave);
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
}
