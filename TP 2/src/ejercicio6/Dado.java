package ejercicio6;

public class Dado {
	
	private int lados;
	private int valorInicial;
	
	//Constructor
	public Dado(int lados) {
		this.lados = lados;
		this.valorInicial = (int)(Math.random()*this.lados)+1;	//Setea un valor random para valor inicial que seria la cara visible
	}

	public int getValor() {
		return valorInicial;
	}
	
	public int getLados() {
		return lados;
	}
	
	public void setValor() {
		this.valorInicial = (int)(Math.random()*this.lados)+1;
	}
	
	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public int tirarDato() {
		setValor();
		return getValor();
	}
	
	
}
