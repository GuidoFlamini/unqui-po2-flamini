package testMercadoCentral;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.MercadoCentral;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class MercadoCentralTestCase {
	MercadoCentral m = new MercadoCentral();
	Producto p1 = new Producto("Marolio", 50);
	ProductoCooperativa p2 = new ProductoCooperativa("Sancor", 100);
	
	@BeforeEach
	public void setUp() throws Exception {
		m = new MercadoCentral();
	}
	
	@Test
	public void testMercadoCentralEmpiezaConCeroProductos() {
		assertEquals(0, m.cantidadDeProductos());
	}
	
	@Test
	public void testSeAgreganComprablesDeCualquierTipoAMercadoCentral() {
		m.agregarProducto(p1);
		m.agregarProducto(p2);
		assertEquals(2, m.cantidadDeProductos());
	}
	
	@Test
	public void testSeRegistraUnProductoEnUnaCaja() {
		m.agregarProducto(p1);
		m.agregarProducto(p2);
		m.registrarProducto(p1);
		assertEquals(1, m.cantidadDeProductos());
		m.registrarProducto(p2);
		assertEquals(140, m.getMontoTotal());
	}
}
