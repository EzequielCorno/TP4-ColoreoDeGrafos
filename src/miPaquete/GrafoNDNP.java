package miPaquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class GrafoNDNP {
	
	private MatrizSimetrica grafo;
	private int cantNodos;
	private int cantAristas;
	private double porcentajeAdyacencia;
	private int gradoMax;
	private int gradoMin;
	private ArrayList<Nodo> nodos;
	private int cantColores;
	
	public GrafoNDNP(String path) throws FileNotFoundException {
		
		File file = new File(path);
		Scanner scan = new Scanner(file);
		int n1;
		int n2;
		nodos = new ArrayList<Nodo>();
		scan.useLocale(Locale.ENGLISH);
		this.cantNodos = scan.nextInt();
		this.cantAristas = scan.nextInt();
		this.porcentajeAdyacencia = scan.nextDouble();
		this.gradoMax = scan.nextInt();
		this.gradoMin = scan.nextInt();
		this.grafo = new MatrizSimetrica(this.cantNodos);
		
		for( int i = 0 ; i < cantNodos ; i++){
			nodos.add(new Nodo(i,-1));
		}
		
		for(int j = 0 ; j < cantAristas*2 ; j++){
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			nodos.get(n1 - 1).aumentarGrado();
			nodos.get(n2 - 1).aumentarGrado();
			grafo.setIndice(n1 - 1, n2 - 1);
			
		}
		
		scan.close();
	}
	
	public void colorearMatula(){
		int color = 1;
		int colorAPintar = color;
		int cantNodosAPintar = cantNodos;
		Collections.sort(nodos, new Comparator<Nodo>(){
			public int compare(Nodo n1, Nodo n2){
				return n1.getGrado()-n2.getGrado();
			}
		});
		//pinto el primer nodo del primer color
		nodos.get(0).setColor(colorAPintar);
		cantNodosAPintar--;
		int i = 0;
		while(cantNodosAPintar > 0){
			int j = 0;
			int cantPintados = 0;
			while(/*cantNodosAPintar > 0 &&*/ j < cantNodos){
				if(!esAdyacente(i, j) && nodos.get(j).getColor() == -1){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;
				}
				if(esAdyacente(i, j) && nodos.get(i).getColor() == nodos.get(j).getColor()){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;					
				}
				j++;
			}
			if(cantNodosAPintar > 0 /*&& cantPintados > 0*/)
				colorAPintar = ++color;
			i++;
		}
		cantColores = color;
	}
	
	public void colorearWelsh_Powell(){
		int color = 1;
		int colorAPintar = color;
		int cantNodosAPintar = cantNodos;
		Collections.sort(nodos, new Comparator<Nodo>(){
			public int compare(Nodo n1, Nodo n2){
				return n2.getGrado()-n1.getGrado();
			}
		});
		//pinto el primer nodo del primer color
		nodos.get(0).setColor(colorAPintar);
		cantNodosAPintar--;
		int i = 0;
		while(cantNodosAPintar > 0){
			int j = 0;
			int cantPintados = 0;
			while(/*cantNodosAPintar > 0 &&*/ j < cantNodos){
				if(!esAdyacente(i, j) && nodos.get(j).getColor() == -1){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;
				}
				if(esAdyacente(i, j) && nodos.get(i).getColor() == nodos.get(j).getColor()){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;					
				}
				j++;
			}
			if(cantNodosAPintar > 0 /* && cantPintados > 0*/)
				colorAPintar = ++color;
			i++;
		}
		cantColores = color;
	}
	
	public void colorearSecuencial(){
		int color = 1;
		int colorAPintar = color;
		int cantNodosAPintar = cantNodos;
		//pinto el primer nodo del primer color
		nodos.get(0).setColor(colorAPintar);
		cantNodosAPintar--;
		int i = 0;
		while(cantNodosAPintar > 0){
			int j = 0;
			int cantPintados = 0;
			while(/*cantNodosAPintar > 0 &&*/ j < cantNodos){
				if(!esAdyacente(i, j) && nodos.get(j).getColor() == -1){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;
				}
				if(esAdyacente(i, j) && nodos.get(i).getColor() == nodos.get(j).getColor()){
					nodos.get(j).setColor(colorAPintar);
					cantNodosAPintar--;
					cantPintados++;					
				}
				j++;
			}
			if(cantNodosAPintar > 0 /*&& cantPintados > 0*/)
				colorAPintar = ++color;
			i++;
		}
		cantColores = color;
	}
	
	private boolean esAdyacente(int nodo1 , int nodo2){
		return grafo.getIndice(nodo1, nodo2);
	}
	
	public void imprimirSalida(String path) throws FileNotFoundException{
		PrintWriter salida = new PrintWriter(new File(path));
		salida.println(cantNodos +" "+ cantColores +" "+ cantAristas +" "+ porcentajeAdyacencia +" "+ gradoMax +" "+ gradoMin);
		for(int i = 0; i < cantNodos ; i++) {
			salida.println(nodos.get(i).getNumero() +" "+ nodos.get(i).getColor());
		}
		
		salida.close();
	}

	public MatrizSimetrica getGrafo() {
		return grafo;
	}
	
	
}
