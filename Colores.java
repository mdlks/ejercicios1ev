package unidad2;

import java.util.Scanner;

public class colores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ingrese valor R: ");
		double red = Double.parseDouble(sc.next());
		System.out.println("ingrese valor G: ");
		double gree = Double.parseDouble(sc.next());
		System.out.println("ingese valor B: ");
		double blue = Double.parseDouble(sc.next());
		
		double y = red*0.299 + gree*0.587 + blue*0.114;
		double i = red*0.596 - gree*0.275 - blue*0.321;
		double q = red+0.212 - gree*0.528 + blue*0.311;
		
		System.out.printf("YIQ= %.3f, %.3f, %.3f" ,y,i,q);

	}

}
