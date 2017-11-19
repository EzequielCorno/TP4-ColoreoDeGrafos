package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GrafoNDNP {
	
	private MatrizSimetrica grafo;
	private int cantNodos;
	private int cantAristas;
	private double porcentajeAdyacencia;
	private int gradoMax;
	private int gradoMin;
	private ArrayList<Nodo> nodos;
	
	public GrafoNDNP(String path) throws FileNotFoundException {
		
		File file = new File(path);
		Scanner scan = new Scanner(file);
		int n1;
		int n2;
		
		nodos = new ArrayList<Nodo>();

		this.cantNodos = scan.nextInt();
		this.cantAristas = scan.nextInt();
		this.porcentajeAdyacencia = scan.nextDouble();
		this.gradoMax = scan.nextInt();
		this.gradoMin = scan.nextInt();
		this.grafo = new MatrizSimetrica(this.cantNodos);
		
		for( int i = 0 ; i < cantNodos ; i++){
			nodos.add(new Nodo(i,-1));
		}
		
		for(int j = 0 ; j < cantAristas ; j++){
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			nodos.get(n1).aumentarGrado();
			nodos.get(n2).aumentarGrado();
			grafo.setIndice(n1, n2);
			
		}
		
		scan.close();
	}
	
}
