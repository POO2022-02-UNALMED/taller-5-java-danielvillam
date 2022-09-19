package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super();
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves(){
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad,String genero) {
		halcones++;
		Ave ave = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		listado.add(ave);
		return ave;
	}
	
	public static Ave crearAguila(String nombre, int edad,String genero) {
		aguilas++;
		Ave ave = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		listado.add(ave);
		return ave;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
}
