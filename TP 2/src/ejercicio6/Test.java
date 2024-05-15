package ejercicio6;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int lados = 6;
		int sumatoriaDado1 = 0;
		int sumatoriaDado2 = 0;
		final int CANT_DE_TIROS = 100;
		
		Dado dado1 = new Dado(lados);
		Dado dado2 = new Dado(lados);
		
		System.out.println("Dado 1: "+dado1.getValor());
		System.out.println("Dado 2: "+dado2.getValor());
		
		System.out.print("\n-------------------------");
		System.out.print("\nSe tiran los dados...");
		dado1.tirarDato();
		dado2.tirarDato();
		
		if(dado1.getValor() == dado2.getValor()) {
			System.out.print("\nLos dados valen lo mismo");
		}else if(dado1.getValor() > dado2.getValor()) {
			System.out.print("\nEl dado 1 es mayor que el dado 2");
		}else{
			System.out.print("\nEl dado 2 es mayor que el dado 1");
		}
		
		System.out.print("\nDado 1: ");
		for(int i=0;i<CANT_DE_TIROS;i++) {
			sumatoriaDado1 += dado1.tirarDato();
			System.out.print(dado1.getValor()+", ");
		}
		
		System.out.print("\nDado 2: ");
		for(int i=0;i<CANT_DE_TIROS;i++) {		
			sumatoriaDado2 += dado2.tirarDato();
			System.out.print(dado2.getValor()+", ");			
		}
		
		//System.out.printf("Hola",1);
		System.out.printf("\nEl promedio de %s del dado 1 es: %s", CANT_DE_TIROS, (( Double.toString((double)sumatoriaDado1/CANT_DE_TIROS) ) ));
		//System.out.printf("\nEl promedio de %s del dado 2 es: %f", CANT_DE_TIROS, (((double)sumatoriaDado2/CANT_DE_TIROS)));
		
		
		teclado.close();
	}

}
