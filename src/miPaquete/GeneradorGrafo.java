package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class GeneradorGrafo {
	private MatrizSimetrica grafo;
	private int cantNodos;
	private int cantAristas;
	private double porcentajeAdyacencia;
	private int[] grado;
	private int gradoMin;
	private int gradoMax;
	private ArrayList<Nodo> nodos;
	
	public GeneradorGrafo(int nd){
		 nodos = new ArrayList<Nodo>();

		 cantNodos = nd;
		 cantAristas = 0;
		 gradoMin = Integer.MAX_VALUE;
		 gradoMax = 0;
		 grafo = new MatrizSimetrica(nd);
		 for(int i = 0; i < cantNodos ; i++)
			 nodos.add(new Nodo(i,-1));
	}
	
	public void aleatoriProbabilidad(double prob){
		if(prob < 0 || prob >1)
			throw new IllegalArgumentException();
		
		
		Random rm = new Random();		
		int cantMaxAristas = cantNodos * (cantNodos -1) / 2; 
		if(cantNodos > cantMaxAristas+1)
			throw new IllegalArgumentException();
		
		for( int i = 0 ; i < cantNodos ; i++){
			for(int j = 0 ; j < i ; j++){
				if(rm.nextDouble() < prob && i != j){
					grafo.setIndice(i, j);
					grafo.getIndice(j, i);
					cantAristas++;
				}
			}
		}
	}
	
	public void regularPorGrado(int grados) {
		int aux = grados;
		int salto = 1;
		int k = 0;
		grado = new int[cantNodos];
		// si cantidad de nodos es par => conecto con el opuesto
		if (aux != 0 && (cantNodos % 2) == 0) {
			while (k + (cantNodos / 2) != cantNodos) {
				// mientras no llegue al
				// ultimo nodo, conecto
				// los opuestos
				grafo.setIndice(k, k + (cantNodos / 2));
				grado[k]++;
				grado[k + (cantNodos / 2)]++;
				k++;
				cantAristas++;
			}
			aux -= 1;
		}
		// mientras no se termino con el grado pedido
		while (aux != 0) {
			for (int i = 0; i < cantNodos; i++) {
				if (i + salto <= cantNodos - 1) {
					if (grafo.getIndice(i, i + salto) == false) {
						grafo.setIndice(i, i + salto);
						cantAristas++;
						grado[i]++;
						grado[i + salto]++;
					}
				} else {
					if (grafo.getIndice((i + salto) - (cantNodos), i) == false) {
						grafo.setIndice((i + salto) - (cantNodos), i);
						cantAristas++;
						grado[(i + salto) - (cantNodos)]++;
						grado[i]++;
					}
				}
			}
			aux -= 2;
			salto++;
		}
		cantAristas--;
		for(int i = 0 ; i < grado.length ; i++) {
			if(gradoMin > grado[i]) {
				gradoMin = grado[i];
			}
		}
		for(int i = 0 ; i < grado.length ; i++) {
			if(gradoMax < grado[i]) {
				gradoMax = grado[i];
			}
		}
		porcentajeAdyacencia = cantAristas / ((cantNodos*(cantNodos -1 ))/2);
	}
	
	public void imprimirSalida(String path) throws FileNotFoundException {
		PrintWriter salida = new PrintWriter(new File(path));
		salida.println(cantNodos +" "+ cantAristas +" "+ porcentajeAdyacencia +" "+ gradoMax +" "+ gradoMin);
		for(int i = 0; i < cantNodos ; i++) {
			for(int j = 0; j < cantNodos ; j++) {
				if(grafo.getIndice(i, j) == true) {
					int nodo1 = i+1;
					int nodo2 = j+1;
					salida.println(nodo1 +" "+ nodo2);
				}
			}
		}
		salida.close();
	}
}
