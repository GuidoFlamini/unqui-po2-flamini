package testMercadoCentral;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class ProductoCooperativaTestCase {
	ProductoCooperativa p1 = new ProductoCooperativa("Marolio", 500);
	
	@BeforeEach
	public void setUp() throws Exception {
		p1 = new ProductoCooperativa("Marolio", 500);
	}
	
	@Test
	public void testProductoCooperativaTieneUnDescuentoDel10PorCiento() {
		p1.setPrecio(1000);
		assertEquals(900, p1.getPrecio());
		
	}
}