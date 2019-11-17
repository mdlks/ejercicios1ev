package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("que tabla quieres practicar?: ");
		int opcion = sc.nextInt();
		while (opcion<1||opcion>9) {
			System.out.println("debe ser entre 1 y 9: ");
			opcion = sc.nextInt();
		}
		int respuesta=0;
		int errores=0;
		while (opcion!=0&&opcion>0&&opcion<10) {
												
				for (int i=1;i<=10;i++) {
					
					System.out.println("cuanto es " + opcion + "X"+i+":");
					respuesta = sc.nextInt();
					if (respuesta != opcion*i) {
						errores++;
				
					}
				System.out.println("RESULTADO: "+opcion*i);
				System.out.println();
				
				}
				System.out.println("++++++++++++++");
				opcion=0;
				System.out.printf("has tenido %d errores",errores);
				System.out.println();
				if (errores>=2) {
					System.out.println("SUSPENSO");
				}
				else System.out.println("APROBASTE!!!");
				errores=0;
				System.out.println("Si quieres continuar practicando pulsa 1 sino pulsa otra tecla : ");
				int continuar = sc.nextInt();
				if (continuar==1) {
					System.out.println("con qué tabla quieres continuar?: ");
					opcion = sc.nextInt();
					while (opcion<1||opcion>9) {
						System.out.println("debe ser entre 1 y 9: ");
						opcion = sc.nextInt();
					}
				}
				else {
					System.out.println("Adios!!!");
					opcion = 0;
				}
				
			}
		
	
		

		}

	}
