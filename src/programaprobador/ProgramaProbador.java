package programaprobador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import miPaquete.MatrizSimetrica;
import miPaquete.Nodo;

public class ProgramaProbador {
	
	private MatrizSimetrica grafo;
	private ArrayList<Nodo> nodosColoreados;
	
	public ProgramaProbador(MatrizSimetrica g , String nc) throws FileNotFoundException{
		grafo = new MatrizSimetrica(g.getOrdenMatriz());
		Scanner sc = new Scanner(new File(nc));
		for(int i = 0 ; i < g.getOrdenMatriz() ; i++)
			for(int j = 0 ; j < g.getOrdenMatriz() ; j++){
				if(g.getIndice(i, j))
					grafo.setIndice(i, j);
			}
		int cantNodos = sc.nextInt();
		int cantColores = sc.nextInt();
		int cantAristas = sc.nextInt();
		sc.useLocale(Locale.ENGLISH);
		double pAd = sc.nextDouble();
		int gradoMax = sc.nextInt();
		int gradoMin = sc.nextInt();
		nodosColoreados = new ArrayList<Nodo>();
		for(int i = 0 ; i < cantNodos ; i++)
			nodosColoreados.add(new Nodo(sc.nextInt(),sc.nextInt()));
		sc.close();
	}
	
	public boolean valido(){
		for(int i = 0 ; i < grafo.getOrdenMatriz() ; i++)
			for(int j = 0 ; j < grafo.getOrdenMatriz() ; j++){
				if(grafo.getIndice(i, j) && nodosColoreados.get(i).getColor() == nodosColoreados.get(j).getColor())
					return false;
			}		
		return true;
	}
	
	
}
