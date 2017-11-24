package estadistica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import miPaquete.GrafoNDNP;

public class Estadistica {

	public static void main(String[] args) throws FileNotFoundException {
		
		int cantCorridas = 10000;
		int cantColoresMax = 1;
		int nroCorrida = 0;
		PrintWriter salida1 = new PrintWriter(new File("Secuencial600-40.in"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			GrafoNDNP g1 = new GrafoNDNP("aleatorio40.in");
			g1.colorearSecuencial();
			nroCorrida = i;
			salida1.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida1.close();
		
		PrintWriter salida2 = new PrintWriter(new File("Matula600-40.in"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			GrafoNDNP g1 = new GrafoNDNP("aleatorio40.in");
			g1.colorearMatula();
			nroCorrida = i;
			salida2.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida2.close();
		
		PrintWriter salida3 = new PrintWriter(new File("WelshPowell600-40.in"));
		for(int i = 1 ; i <= cantCorridas ; i++) {
			GrafoNDNP g1 = new GrafoNDNP("aleatorio40.in");
			g1.colorearWelsh_Powell();
			nroCorrida = i;
			salida3.println(nroCorrida +";"+ g1.getCantColores());
		}
		salida3.close();
	}

}
