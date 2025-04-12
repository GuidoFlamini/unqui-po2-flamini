package ar.edu.unq.po2.tp3;

public class Ej4TP3 {

	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;
		
		String x = 1 + a;
		
		System.out.println("1) La longitud de s es: " + s.length());
		System.out.println("2) La variable t no está inicializada, por lo que no puede saberse su longitud");
		System.out.println("3) 1 + a es: " + x);
		System.out.println("4) a en mayúsculas es: " + a.toUpperCase());
		System.out.println("5) " + "Libertad".indexOf("r"));
		System.out.println("6) " + "Universidad".lastIndexOf('i'));
		System.out.println("7) " + "Quilmes".substring(2,4));
		System.out.println("8) " + (a.length() + a).startsWith("a"));
		if(s==a) {
			System.out.println("9) s == a es verdadero");
		} else {
			System.out.println("9) s == a es falso");
		}
		System.out.println("10) " + a.substring(1,3).equals("bc"));

	}

}
