package ejercicio1;

public class Ejercicio1 {
	
	public Ejercicio1() {}
	
	public int sumar(int n1, int n2) {
		return n1+n2;
	}
	
	
	//Esta funcion genera un numero aleatorio entre n1 y n2;
	public int pedirNumero(String texto, int n1, int n2) {
		int r = n1;
		
		if(n1 != n2) {
			if(n1>n2){
				//n1-n2 es el Delta T entre n1 y n2.
				r = (int)(Math.random()*(n1-n2))+1-n2;
				System.out.println();
			}else {
				r = (int)(Math.random()*(n2-n1))+1+n1;
			}
		}
	
		return r;
	}	
}
