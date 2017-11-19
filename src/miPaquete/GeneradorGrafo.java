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
		 porcentajeAdyacencia = 0.0;
		 for(int i = 0; i < cantNodos ; i++)
			 nodos.add(new Nodo(i,-1));
	}
	
	public void aleatorioProbabilidad(double prob){
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
					nodos.get(i).aumentarGrado();
					nodos.get(j).aumentarGrado();
					cantAristas++;
				}
			}
		}
		for(int i = 0; i<cantNodos ; i++){
			if(gradoMax < nodos.get(i).getGrado())
				gradoMax = nodos.get(i).getGrado();
		}
		for(int i = 0; i < cantNodos ; i++){
			if(gradoMin > nodos.get(i).getGrado())
				gradoMin = nodos.get(i).getGrado();
		}
		porcentajeAdyacencia = (cantAristas /(cantNodos*(cantNodos - 1) / 2));
	}
	
	public void aleatorioPorcentajeAdyacencia(double ad){
		int nodo1;
		int nodo2;
		int auxAristas;
		porcentajeAdyacencia = ad;
		cantAristas = (int) ((cantNodos * (cantNodos -1) / 2) * porcentajeAdyacencia);
		auxAristas = cantAristas;
		while (auxAristas > 0) {
			nodo1 = new Random().nextInt(cantNodos);
			nodo2 = new Random().nextInt(cantNodos);
			if (nodo1 != nodo2 && !grafo.getIndice(nodo1, nodo2)) {
				grafo.setIndice(nodo1, nodo2);
				nodos.get(nodo1).aumentarGrado();
				nodos.get(nodo2).aumentarGrado();
				auxAristas--;
			}
		}
		for(int i = 0; i<cantNodos ; i++){
			if(gradoMax < nodos.get(i).getGrado())
				gradoMax = nodos.get(i).getGrado();
		}
		for(int i = 0; i < cantNodos ; i++){
			if(gradoMin > nodos.get(i).getGrado())
				gradoMin = nodos.get(i).getGrado();
		}
	}
	
	public void regularPorGrado(int grados) {
		int aux = grados;
		int salto = 1;
		int k = 0;
		// si cantidad de nodos es par => conecto con el opuesto
		if (aux != 0 && (cantNodos % 2) == 0) {
			while (k + (cantNodos / 2) != cantNodos) {
				// mientras no llegue al
				// ultimo nodo, conecto
				// los opuestos
				grafo.setIndice(k, k + (cantNodos / 2));
				nodos.get(k).aumentarGrado();
				nodos.get(k + (cantNodos / 2)).aumentarGrado();
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
						nodos.get(i).aumentarGrado();
						nodos.get(i + salto).aumentarGrado();
					}
				} else {
					if (grafo.getIndice((i + salto) - (cantNodos), i) == false) {
						grafo.setIndice((i + salto) - (cantNodos), i);
						cantAristas++;
						nodos.get((i + salto) - (cantNodos)).aumentarGrado();
						nodos.get(i).aumentarGrado();
					}
				}
			}
			aux -= 2;
			salto++;
		}
		gradoMin = grados;
		gradoMax = grados;
		//porcentajeAdyacencia = (grados / (cantNodos - 1 )) * 100;
		porcentajeAdyacencia = (cantAristas /(cantNodos*(cantNodos - 1) / 2));
	}
	
	public void regularPorcentajeDeAdyacencia(double ad){
	int grado = (int) ( ad * (cantNodos - 1) );
	regularPorGrado(grado);
	}
	
	public void nPartito(int n) {
		int [] ubicacionNodoEnParticion = new int [cantNodos];
		for (int i = 0; i < cantNodos; i++) {
			ubicacionNodoEnParticion[i] = new Random().nextInt(n);
		}
		for (int i = 0; i < cantNodos; i++) {
			for (int j = i + 1; j < cantNodos; j++) {
				if(ubicacionNodoEnParticion[i] != ubicacionNodoEnParticion[j] && !grafo.getIndice(i, j)) {
					grafo.setIndice(i, j);
					nodos.get(i).aumentarGrado();
					nodos.get(j).aumentarGrado();
					cantAristas++;
				}
			}
		}
		for(int i = 0; i<cantNodos ; i++){
			if(gradoMax < nodos.get(i).getGrado())
				gradoMax = nodos.get(i).getGrado();
		}
		for(int i = 0; i < cantNodos ; i++){
			if(gradoMin > nodos.get(i).getGrado())
				gradoMin = nodos.get(i).getGrado();
		}
		porcentajeAdyacencia = (cantAristas /(cantNodos*(cantNodos - 1) / 2));
	}
	
	public void imprimirSalida(String path) throws FileNotFoundException {
		PrintWriter salida = new PrintWriter(new File(path));
		salida.println(cantNodos +" "+ cantAristas +" "+ porcentajeAdyacencia +" "+ gradoMax +" "+ gradoMin);
		for(int i = 0; i < cantNodos ; i++) {
			for(int j = 0; j < cantNodos ; j++) {
				if(grafo.getIndice(i, j)) {
					int nodo1 = i+1;
					int nodo2 = j+1;
					salida.println(nodo1 +" "+ nodo2);
				}
			}
		}
		salida.close();
	}
}
