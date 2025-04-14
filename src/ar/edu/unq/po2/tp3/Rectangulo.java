package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private int base;
	private int altura;
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	private Point vertice;
	
	public Point getVertice() {
		return vertice;
	}

	public void setVertice(Point vertice) {
		this.vertice = vertice;
	}

	
	public void crearRectanguloDeAltura_YBase_En(int h, int b, Point p) {
		this.altura = h;
		this.base = b;
		this.setVertice(p); 
	}
	
	public int area() {
		int area = this.getAltura() * this.getBase();
		return area;
	}
	
	public int perimetro() {
		int perimetro = (this.altura * 2) + (this.base * 2);
		return perimetro;
	}
	
	public boolean esHorizontal() {
		return (this.base > this.altura);
	}
}
