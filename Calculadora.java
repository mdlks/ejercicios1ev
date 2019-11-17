package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int menu=1;
		while (menu==1) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("**********************************");
		System.out.printf("*qué operación quieres realizar? *\n");
		System.out.println("**********************************");
		System.out.println("* Pulsa + para sumar             *");
		System.out.println("* Pulsa - para restar            *");
		System.out.println("* Pulsa * para multiplicar       *");
		System.out.println("* Pulsa / para dividir           *");
		System.out.println("----------------------------------");
		System.out.println("*cualquier otra tecla para salir *");
		System.out.println("**********************************");
		String operacion= sc.next();
		
		if (operacion.equals("+")||operacion.equals("-")||operacion.equals("*")||operacion.equals("/")){
		System.out.println("ingresa el primer numero");
		double num1 = sc.nextDouble();
		System.out.println("ahora ingresa el segundo número");
		double num2 = sc.nextDouble();
		double resultado;
		if (operacion.equals("+")){
			resultado=num1+num2;
			System.out.printf(num1+"+"+num2+"= %.2f", resultado);
			
		}
		if (operacion.equals("-")){
			resultado=num1-num2;
			System.out.printf(num1+"-"+num2+"= %.2f", resultado);
		}
		if (operacion.equals("*")){
			resultado=num1*num2;
			System.out.printf(num1+"*"+num2+"= %.2f", resultado);
		}
		if (operacion.equals("/")){
			resultado=num1/num2;
			System.out.printf(num1+"/"+num2+"= %.2f", resultado);
		}
		System.out.println("\n");
		}
		else {
			System.out.println("ADIOS");
			menu=0;
			sc.close();
		}
		
		}
		}
	}
		



