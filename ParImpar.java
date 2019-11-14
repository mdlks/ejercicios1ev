package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("el número  es par");
		else
			System.out.println("el número es impar");
		
		
		

	}

}
