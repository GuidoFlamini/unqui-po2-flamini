package ar.edu.unq.po2.tp3;

public class Point {
	int x;
	int y;
	String color;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point createPoint() {
		Point p = new Point();
		p.x=0;
		p.y=0;
		return p;
	}
	
	public Point createPointXY(int x, int y) {
		Point p = new Point();
		p.x=x;
		p.y=y;
		return p;
	}
	
	public void movePointTo(Point p, int x, int y) {
		p.x=x;
		p.y=y;
	}
	
	public Point sumarPoints(Point a, Point b) {
		Point c = new Point();
		c.x = a.x + b.x;
		c.y = a.y + b.y;
		return c;
	}
}
