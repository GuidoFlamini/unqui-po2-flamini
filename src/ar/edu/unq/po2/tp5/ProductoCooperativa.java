package ar.edu.unq.po2.tp5;

public class ProductoCooperativa implements Comprable {
	private String nombre;
	private double precio;
	
	public ProductoCooperativa(String n, double p){
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
		double precioConDescuento = precio * 0.90;
		return precioConDescuento ;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	} 
	

}
