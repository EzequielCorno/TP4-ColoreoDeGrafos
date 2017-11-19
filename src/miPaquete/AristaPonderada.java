package miPaquete;

public class AristaPonderada extends Arista {
	private int valor;

	public AristaPonderada(int nodo1, int nodo2, int valor) {
		super(nodo1, nodo2);
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void mostrar() {
		System.out.println(this.getNodo1() + " " + this.getNodo2() + " " + this.getValor());
	}

	public int compareTo(AristaPonderada arista) {
		return this.valor - arista.getValor();
	}
}
