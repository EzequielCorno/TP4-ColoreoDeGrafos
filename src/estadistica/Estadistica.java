package estadistica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import miPaquete.GrafoNDNP;

public class Estadistica {

	public static void main(String[] args) throws FileNotFoundException {
		
		int cantCorridas = 10000;
		int cantColoresMax = 1;
		int nroCorrida = 0;
		/*GrafoNDNP g1 = new GrafoNDNP("1000_75.in");
		PrintWriter salida1 = new PrintWriter(new File("estadisticaSecuencial75.csv"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			g1.reiniciarColoreo();
			g1.colorearSecuencial();
			nroCorrida = i;
			salida1.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida1.close();
		
		PrintWriter salida2 = new PrintWriter(new File("estadisticaMatula75.csv"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			g1.reiniciarColoreo();
			g1.colorearMatula();
			nroCorrida = i;
			salida2.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida2.close();
		
		PrintWriter salida3 = new PrintWriter(new File("estadisticaWelshPowell75.csv"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			g1.reiniciarColoreo();
			g1.colorearWelsh_Powell();
			nroCorrida = i;
			salida3.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida3.close();
		*/
		Scanner sc = new Scanner(new File("estadisticaMatula40.csv"));
		HashMap<Integer, Integer> frecuencia = new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000 ; i++){
			String linea = sc.nextLine();
			String[] parts = linea.split(";");
			if(frecuencia.containsKey(Integer.valueOf(parts[1]))) {
				frecuencia.put(Integer.valueOf(parts[1]), frecuencia.get(Integer.valueOf(parts[1])) + 1 );
			} else {
				frecuencia.put(Integer.valueOf(parts[1]), 1);
			}
		}
		sc.close();
		
		for (Entry<Integer, Integer> entry : frecuencia.entrySet()) {
		    System.out.println("cantColores= " + entry.getKey() + ", cantRepeciones= " + entry.getValue());
		}
	}

}
