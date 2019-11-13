package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in); //convierte a string lo que leo del teclado
		BufferedReader br = new BufferedReader (isr);//guarda lo que leo del teclado en un buffer
		
		System.out.println("dime tu nombre:");
		long inicio = System.currentTimeMillis();
		
		String nombre= br.readLine();
		
		long fin = System.currentTimeMillis();
		 
		double resultado = (double)(fin - inicio) /1000;
		
		System.out.printf("hola "+ nombre+ " has tardado %.3f",resultado);
		
		
		
	}

}
