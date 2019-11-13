package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in); //convierte a string lo que leo del teclado
		BufferedReader br = new BufferedReader (isr);//guarda lo que leo del teclado en un buffer
		
		System.out.println("dame el dato en euros:");
		double euros = Double.parseDouble(br.readLine());
		//System.out.println("el dato es="+euros);
		double dolares = euros * 1.10;
		System.out.printf("en dolares = %.2f",dolares );
		
		
		
	}

}
