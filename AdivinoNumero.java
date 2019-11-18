package unidad3;

import java.util.Scanner;

public class AdivinoNumero 
{

	public static void main(String[] args)
	{
		
		int inferior=1;
		int superior;
		int mitad;
		boolean acierto=false;
		int respuesta;
		Scanner sc= new Scanner(System.in);
		System.out.println("dime el valor límite superior");
		superior=sc.nextInt();
		while (inferior<=superior && acierto==false)
		{
			mitad = (superior+inferior)/2;
			System.out.println("el número es: " + mitad);
			System.out.println("pulsa 1 si el número que has pensado es menor, 2 si es mayor o 3 si he acertado");
			respuesta = sc.nextInt();
			if (respuesta==3)
			{
				System.out.println("He ganado");
				acierto=true;
			}
			if (respuesta==1)
			{
				superior=mitad-1;
			}
			if (respuesta==2)
			{
				inferior=mitad+1;
			}
			
		}
		if (acierto==false)
			{
			System.out.println("me mentiste!!!");
			}
	}

}
