package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in); //convierte a string lo que leo del teclado
		BufferedReader br = new BufferedReader (isr);//guarda lo que leo del teclado en un buffer
		
		System.out.println("que sacaste en el examen de matematicas? :");
		double nota_examen = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 1 de matematicas? :");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 2 de matematicas? :");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 3 de matematicas? :");
		double t3 = Double.parseDouble(br.readLine());
		double nota_media_matem= (0.9*nota_examen)+(((t1+t2+t3)/3)*0.1);
		System.out.println("tu media en matematicas es : "+nota_media_matem);
		
		System.out.println("que sacaste en el examen de fisica? :");
		nota_examen = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 1 de fisica? :");
		t1 = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 2 de fisica? :");
		t2 = Double.parseDouble(br.readLine());
		double nota_media_fisica= (0.9*nota_examen)+(((t1+t2)/2)*0.1);
		System.out.println("tu media en fisica es : "+nota_media_fisica);
		
		System.out.println("que sacaste en el examen de quimica? :");
		nota_examen = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 1 de quimica? :");
		t1 = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 2 de quimica? :");
		t2 = Double.parseDouble(br.readLine());
		System.out.println("que sacaste en la tarea 3 de quimica? :");
		t3 = Double.parseDouble(br.readLine());
		double nota_media_quimica= (0.9*nota_examen)+(((t1+t2+t3)/3)*0.1);
		System.out.println("tu media en quimica es : "+nota_media_quimica);
		
		double media_total= (nota_media_matem+nota_media_fisica+nota_media_quimica)/3;
		System.out.println("la nota media total es : " + media_total);
		
	}

}
