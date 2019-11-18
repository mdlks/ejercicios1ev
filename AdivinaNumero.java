package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
	
		int n1=1;
		int n2=(int) (Math.random()*100000+1000);
		
		int n3=(int) (Math.random()*n2+n1);
		System.out.println("He pensado en un numero entre 1 y "+ n2 + " adivina cuál es...");
		int opcion ; 
		boolean acertado=false; 
		Scanner sc= new Scanner (System.in);
		while (acertado==false)
		{
			System.out.println("dime un número: ");
			opcion = sc.nextInt();
			if (opcion<n3)
			{
				System.out.println("el número que he pensado es mayor!");
			}
			if (opcion>n3) 
			{
				System.out.println("el número que he pensado es menor!");
			}
			if (opcion==n3)
			{
				System.out.println("Has acertado!!!");
				acertado=true;
			}
		}	
		sc.close();
		

	}
}
