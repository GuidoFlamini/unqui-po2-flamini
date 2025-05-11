package testMercadoCentral;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Producto;

public class ProductoTestCase {
	Producto p1 = new Producto("Marolio", 500);
	
	@BeforeEach
	public void setUp() throws Exception {
		p1 = new Producto("Marolio", 500);
	}
	
	@Test
	public void testProductoTieneUnPrecioYNombre() {
		
		assertEquals(500, p1.getPrecio());
		assertEquals("Marolio", p1.getNombre());
		
	}
	
	@Test
	public void testProductoPuedeCambiarSuPrecioYNombre() {
		p1.setNombre("Capelettini");
		p1.setPrecio(1000);
		assertEquals(1000, p1.getPrecio());
		assertEquals("Capelettini", p1.getNombre());
	}
}
