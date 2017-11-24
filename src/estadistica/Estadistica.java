package estadistica;

import java.io.FileNotFoundException;
import miPaquete.GrafoNDNP;

public class Estadistica {

	public static void main(String[] args) throws FileNotFoundException {
		
		int cantCorridas = 10000;
		int cantColoresMax = 1;
		int nroCorrida = 0;
		
		GrafoNDNP g1 = new GrafoNDNP("aleatorio40.in");
		g1.colorearSecuencial();
		
		for(int i = 1 ; i <= cantCorridas ; i++) {
			if(g1.getCantColores() > cantColoresMax) {
				cantColoresMax = g1.getCantColores();
				nroCorrida = i;
			}
		}
		System.out.println("La cantidad de colores minimos es " + cantColoresMax + "y se dio en la " + nroCorrida + "corrida" );
	}

}
