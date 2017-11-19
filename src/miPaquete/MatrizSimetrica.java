package miPaquete;

public class MatrizSimetrica {

	private boolean[] matrizSimetrica;
	private int ordenMatriz;
	private int dimensionVector;

	/**
	 * Constructor de la Matriz simetrica a partir de un orden
	 * 
	 * @param n
	 */
	public MatrizSimetrica(int n) {

		this.ordenMatriz = n;
		this.dimensionVector = (n * n - n) / 2;
		matrizSimetrica = new boolean[this.dimensionVector];

		for (int i = 0; i < n - 1; i++)
			matrizSimetrica[i] = false;
	}

	public void ponerArista(int pos) {
		matrizSimetrica[pos] = true;
	}

	public boolean hayArista(int pos) {
		return matrizSimetrica[pos];
	}

	public boolean getIndice(int fil, int col) {
		int aux;
		if (fil == col) {
			return false;			
		}
		if (col < fil) {
			aux = fil;
			fil = col;
			col = aux;
		}
		return matrizSimetrica[fil * this.ordenMatriz + col - (fil * fil + 3 * fil + 2) / 2];
	}

	public void setIndice(int fil, int col) {
		int aux;
		if (fil == col) {
			return;			
		}
		if (fil > col) {
			aux = fil;
			fil = col;
			col = aux;
		}
		matrizSimetrica[fil * this.ordenMatriz + col - (fil * fil + 3 * fil + 2) / 2] = true;
	}

	public void mostrar() {
		for (int i = 0; i < this.dimensionVector; i++) {
			if (this.matrizSimetrica[i])
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}

	}

	public int getOrdenMatriz() {
		return this.ordenMatriz;
	}

	public int getDimension() {
		return this.dimensionVector;
	}

}
