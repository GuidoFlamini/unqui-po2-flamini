package ar.edu.unq.po2.tp5;
import java.util.ArrayList;


public class MercadoCentral {
	private ArrayList<Producto> productos = new ArrayList<>();
	private double montoTotal = 0;

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public void registrarProducto(Producto p) {
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
