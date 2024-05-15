package ejercicio6;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int lados;
		int sumatoriaDado1 = 0;
		int sumatoriaDado2 = 0;
		final int CANT_DE_TIROS = 100;
		
		
		/*
		do {
			System.out.print("\nIngrese la cantidad de lados del dado");
			lados = Integer.parseInt(teclado.nextLine());
			if( lados<=0 && (lados > 6)) {
				System.out.print("\nIngrese un numero de 1 a 6");
			}
		}while( lados<=0 && (lados > 6) ); 
		*/
		
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		
		System.out.println("Dado 1: "+dado1.getValor());
		System.out.println("Dado 2: "+dado2.getValor());
		
		dado1.tirarDato();
		dado2.tirarDato();
		
		if(dado1.getValor() == dado2.getValor()) {
			System.out.print("\nLos dados valen lo mismo");
		}else if(dado1.getValor() > dado2.getValor()) {
			System.out.print("\nEl dado 1 es mayor que el dado 2");
		}else{
			System.out.print("\nEl dado 2 es mayor que el dado 1");
		}
		
		
		for(int i=0;i<100;i++) {
			sumatoriaDado1 += dado1.tirarDato();
			sumatoriaDado2 += dado2.tirarDato();
		}
		
		System.out.print("\nPromedia");
		
		
		
	}

}
