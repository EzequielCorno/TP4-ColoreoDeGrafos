package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import miPaquete.GrafoNDNP;

public class testColoreo {

	@Test
	public void testColoreoSecuencialNPartito() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		g1.colorearSecuencial();
		g1.imprimirSalida("grafoColoreadoSecuencialNPartito.out");
	}

	@Test
	public void testColoreoMatulaNPartito() throws FileNotFoundException {
		GrafoNDNP g2 = new GrafoNDNP("grafoNPartito.in");
		g2.colorearMatula();
		g2.imprimirSalida("grafoColoreadoMatulaNPartito.out");
	}
	
	@Test
	public void testColoreoWelsh_PowellNPartito() throws FileNotFoundException {
		GrafoNDNP g3 = new GrafoNDNP("grafoNPartito.in");
		g3.colorearWelsh_Powell();
		g3.imprimirSalida("grafoColoreadoWelshPowellNPartito.out");
	}
	
	@Test
	public void testColoreoSecuencialAleaPorAdy() throws FileNotFoundException {
		GrafoNDNP g4 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		g4.colorearSecuencial();
		g4.imprimirSalida("grafoColoreadoSecuencialAleaPorAdy.out");
	}

	@Test
	public void testColoreoMatulaAleaPorAdy() throws FileNotFoundException {
		GrafoNDNP g5 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		g5.colorearMatula();
		g5.imprimirSalida("grafoColoreadoMatulaAleaPorAdy.out");
	}
	
	@Test
	public void testColoreoWelsh_PowellAleaPorAdy() throws FileNotFoundException {
		GrafoNDNP g6 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		g6.colorearWelsh_Powell();
		g6.imprimirSalida("grafoColoreadoWelshPowellAleaPorAdy.out");
	}
	
	@Test
	public void testColoreoSecuencialAleaProb() throws FileNotFoundException {
		GrafoNDNP g7 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		g7.colorearSecuencial();
		g7.imprimirSalida("grafoColoreadoSecuencialAleaProb.out");
	}

	@Test
	public void testColoreoMatulaAleaProb() throws FileNotFoundException {
		GrafoNDNP g8 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		g8.colorearMatula();
		g8.imprimirSalida("grafoColoreadoMatulaAleaProb.out");
	}
	
	@Test
	public void testColoreoWelsh_PowellAleaProb() throws FileNotFoundException {
		GrafoNDNP g9 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		g9.colorearWelsh_Powell();
		g9.imprimirSalida("grafoColoreadoWelshPowellAleaProb.out");
	}
	
	@Test
	public void testColoreoSecuencialRegPorAdy() throws FileNotFoundException {
		GrafoNDNP g10 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		g10.colorearSecuencial();
		g10.imprimirSalida("grafoColoreadoSecuencialRegPorAdy.out");
	}

	@Test
	public void testColoreoMatulaRegPorAdy() throws FileNotFoundException {
		GrafoNDNP g11 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		g11.colorearMatula();
		g11.imprimirSalida("grafoColoreadoMatulaRegPorAdy.out");
	}
	
	@Test
	public void testColoreoWelsh_PowellRegPorAdy() throws FileNotFoundException {
		GrafoNDNP g12 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		g12.colorearWelsh_Powell();
		g12.imprimirSalida("grafoColoreadoWelshPowellRegPorAdy.out");
	}
	
	@Test
	public void testColoreoSecuencialRegPorGra() throws FileNotFoundException {
		GrafoNDNP g13 = new GrafoNDNP("grafoRegularPorGrado.in");
		g13.colorearSecuencial();
		g13.imprimirSalida("grafoColoreadoSecuencialRegPorGra.out");
	}

	@Test
	public void testColoreoMatulaRegPorGra() throws FileNotFoundException {
		GrafoNDNP g14 = new GrafoNDNP("grafoRegularPorGrado.in");
		g14.colorearMatula();
		g14.imprimirSalida("grafoColoreadoMatulaRegPorGra.out");
	}
	
	@Test
	public void testColoreoWelsh_PowellRegPorGra() throws FileNotFoundException {
		GrafoNDNP g15 = new GrafoNDNP("grafoRegularPorGrado.in");
		g15.colorearWelsh_Powell();
		g15.imprimirSalida("grafoColoreadoWelshPowellRegPorGra.out");
	}
}
