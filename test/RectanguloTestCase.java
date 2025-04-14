import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Rectangulo;
import ar.edu.unq.po2.tp3.Point;

class RectanguloTestCase {
	Point p = new Point();
	Rectangulo r2 = new Rectangulo();
	
	@BeforeEach
	public void setUp() throws Exception {
		p = p.createPoint();
		r2.crearRectanguloDeAltura_YBase_En(4, 5, p);
	}
	
	@Test
	public void seCreaUnRectanguloHorizontalDeBase4YAltura5() {
		assertEquals(r2.getBase(), 5);
		assertEquals(r2.getAltura(), 4);
		assertEquals(r2.getVertice(), p);
		assertEquals(r2.esHorizontal(), true);
	}
	
	@Test 
	public void seQuiereSaberElAreaYElPerimetroDelRectangulo() {
		assertEquals(r2.area(), 20);
		assertEquals(r2.perimetro(), 18);
	}
}
