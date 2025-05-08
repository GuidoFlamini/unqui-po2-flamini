package ar.edu.unq.po2.tp5;

public class Producto {
	private String nombre;
	private double precio;
	
	Producto(String n, double p){
		nombre = n;
		precio = p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
