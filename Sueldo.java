package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ingresa sueldo base: ");
		double sueldo_base = Double.parseDouble(sc.next());;
		System.out.println("ingresa importe venta 1: ");
		double venta1 = Double.parseDouble(sc.next());
		System.out.println("ingresa importe venta 2: ");
		double venta2 = Double.parseDouble(sc.next());
		System.out.println("ingresa importe venta 3: ");
		double venta3 = Double.parseDouble(sc.next());
		
		double comisiones = (venta1+venta2+venta3)*0.1;
		double sueldo_mes = sueldo_base + comisiones;
		
		System.out.printf("comisiones: € %.2f ",comisiones);
		System.out.println();
		System.out.printf("sueldo total:€ %.2f",sueldo_mes);
		
	}

}
