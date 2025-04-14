
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTestCase {
	Point p1 = new Point();
	Point p2 = new Point();
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el Point
		p1 = p1.createPoint();
		p2 = p2.createPointXY(2, 4);
	}
	
	@Test
	public void testP1yP2TienenLasCoordenadasIndicadas() {
		
		assertEquals(0, p1.getX());
		assertEquals(0, p1.getY());
		assertEquals(2, p2.getX());
		assertEquals(4, p2.getY());
	}
	
	@Test
	public void testP1seMueveAOtraPosicion() {
		
		assertEquals(0, p1.getX());
		assertEquals(0, p1.getY());
		
		p1.movePointTo(p1, 3, 9);
		
		assertEquals(3, p1.getX());
		assertEquals(9, p1.getY());
	}
	
	@Test
	public void testP1yP2SeSuman() {
		Point p3 = new Point();
		p1.movePointTo(p1, 3, 9);
		p3 = p3.sumarPoints(p2, p1);
		assertEquals(5, p3.getX());
		assertEquals(13, p3.getY());
	}
}
