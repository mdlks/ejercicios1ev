package unidad3;

import java.util.Scanner;

public class TrianguloFloyd
{
     
    private static Scanner sc;
     
    public static void main(String[] args) 
    {
        
        System.out.print("Introduce el número de líneas del triángulo de Floyd: ");
        sc = new Scanner(System.in);
        int filas;
        filas = sc.nextInt();
        int contador=1;
        
        for (int i=1;i<=filas;i++)//controlamos las filas
        {
        	for (int j=1;j<=i;j++)//controlamos las columnas
        	{
        		System.out.print(contador);
        		contador++;
        	}
        	System.out.println();//cambios de fila
        }
        
    }    
        
}