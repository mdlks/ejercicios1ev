
package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime un AÑO: ");
		int anio = sc.nextInt();
		
		
		
		if (anio % 4 ==0) {
			if (anio %100==0) {
				
				if (anio%400==0) {
					System.out.printf("EL AÑO %d ES BISIESTO", anio);
				}
				else System.out.printf("EL AÑO %d NO ES BISIESTO", anio);
			}
			else {
				System.out.printf("EL AÑO %d ES BISIESTO", anio);
			}
			
		}
		else {
			System.out.printf("EL AÑO %d NO ES BISIESTO", anio);
		}
		

	}

}
