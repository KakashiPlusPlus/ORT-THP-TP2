package ejercicio1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Ejercicio1 obj1 = new Ejercicio1();
		Scanner teclado = new Scanner(System.in);
		String s;
		int n1, n2;
		
		do{
			System.out.print("SALIR DEL PROGRAMA - 0"
					+ "\nSUMAR DOS NUMEROS - 1"
					+ "\nGENERAR NUMERO RANDOM ENTRE DOS NUMEROS - 2");
			switch (teclado.nextLine()) {	//Ingreso por teclado
				case "0":
					System.out.print("\nEligio finalizar el programa.");
				case "1":
					System.out.print("\nSUMA DE NUMEROS \nIngrese el primer numero: ");
					n1 = teclado.nextInt();		//Ingreso por teclado
					System.out.print("\nIngrese el segundo numero: ");
					
					n2 = teclado.nextInt();		//Ingreso por teclado
					
					System.out.print("\nEl resultado es: "+obj1.sumar(n1, n2));
					
					break;
				case "2":
					System.out.print("\nNUMERO RANDOM ENTRE DOS NUMEROS \nIngrese el primer numero: ");
					n1 = teclado.nextInt();
					System.out.print("\nIngrese el segundo numero: ");
					n2 = teclado.nextInt();
					System.out.print("/nIngrese mensaje de salida: ");
					s = teclado.nextLine();
					
					obj1.pedirNumero(s, n1, n2);
					
					break;
				default:	//Si se ingresa un opcion invalida.
					System.out.print("\nEligio un opcion invalida. Ingrese  una de las opciones especificadas.");
					break;
			}
		
		}while(!"0".equals(teclado.nextLine()));
		
		
		
		
	
		teclado.close();
	}

}
