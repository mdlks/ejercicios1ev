package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingresa HORA: ");
		int hora = sc.nextInt();
		while (hora>23||hora<0) {
			System.out.println("ingresa HORA: ");
			hora = sc.nextInt();
		}
		System.out.println("ingresa MINUTOS: ");
		int minutos = sc.nextInt();
		while (minutos>59||minutos<0) {
			System.out.println("ingresa MINUTOS: ");
			minutos = sc.nextInt();
		}
		System.out.println("ingresa SEGUNDOS: ");
		int segundos = sc.nextInt();
		while (segundos>59||segundos<0) {
			System.out.println("ingresa SEGUNDOS: ");
			segundos = sc.nextInt();
		}
		segundos++;
		
		if (segundos==60) {
			segundos=0;
			minutos=minutos+1;
		}
		
		if (minutos>59) {
			minutos=0;
			hora++;
		}
		
		if (hora>23) {
			hora=0;
		}
		
		System.out.println("HORA: "+ hora + " MINUTOS: "+ minutos+" SEGUNDOS: "+ segundos);

		sc.close();
	}

}
