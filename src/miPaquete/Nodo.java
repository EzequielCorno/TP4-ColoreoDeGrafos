package miPaquete;

public class Nodo {
	private int numero;
	private int grado;
	private int color;

	public Nodo(int n, int c) {
		numero = n+1;
		color = c;
		grado = 0;
	}

	public void aumentarGrado() {
		grado++;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}