package ar.edu.unq.po2.tp5;
import java.util.ArrayList;


public class MercadoCentral {
	private ArrayList<Comprable> productos = new ArrayList<>();
	private double montoTotal = 0;

	public ArrayList<Comprable> getProductos() {
		return productos;
	}
	
	public int cantidadDeProductos() {
		return getProductos().size();
	}
	
	public void agregarProducto(Comprable p) {
		productos.add(p);
	}
	
	public void registrarProducto(Comprable p) {
		double precio = p.getPrecio();
		productos.remove(p);
		montoTotal = montoTotal + precio;
	}
	
	public void iniciarCompra() {
		montoTotal = 0;
	}
	
	public double getMontoTotal() {
		return montoTotal;
	}
	
}
