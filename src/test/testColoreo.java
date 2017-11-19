package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import miPaquete.GrafoNDNP;

public class testColoreo {

	@Test
	public void testColoreoSecuencial() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		g1.colorearSecuencial();
		g1.imprimirSalida("grafoColoreadoSecuencial.out");
	}

	@Test
	public void testColoreoMatula() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		g1.colorearMatula();
		g1.imprimirSalida("grafoColoreadoMatula.out");
	}
	
	@Test
	public void testColoreoWelsh_Powell() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		g1.colorearWelsh_Powell();
		g1.imprimirSalida("grafoColoreadoWelshPowell.out");
	}
}
