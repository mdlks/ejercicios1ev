/*En el método main de una clase llamada Triángulo escribe un programa que determine si tres números reales que 
  se introducen por teclado pueden ser las longitudes de los lados de un triángulo. Si la respuesta es afirmativa, 
  tendrá que responder a las preguntas siguientes:•¿Es escaleno?•¿Es equilátero?•¿Es isósceles?*/
 


package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("DIME LONGUITUD LADO 1: ");
		int lado1 = sc.nextInt();
		System.out.println("DIME LONGUITUD LADO 2: ");
		int lado2 = sc.nextInt();
		System.out.println("DIME LONGUITUD LADO 3: ");
		int lado3 = sc.nextInt();
		
		if ((lado1<(lado2+lado3))&&(lado2<(lado1+lado3))&&(lado3<(lado1+lado2))) {
			if (lado1==lado2 && lado1==lado3) {
				System.out.println("ES EQUILATERO");
			}
			else {
				if (lado1!=lado2 && lado1!=lado3) {
					System.out.println("ES ESCALENO");
				}
				else System.out.println("ES ISOSCELES");
				
			}
	}
		else {
			System.out.println("NO SE PUEDE FORMAR UN TRIANGULO");
		}
}
}

