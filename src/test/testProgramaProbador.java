package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import miPaquete.GrafoNDNP;
import programaprobador.ProgramaProbador;

public class testProgramaProbador {

	/* INICIO TEST SECUENCIAL */
	
	@Test
	public void testProgPobadorNPartito() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencialNPartito.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaPorAdy() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencialAleaPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaProb() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencialAleaProb.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorAdy() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencialRegPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorGra() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencialRegPorGra.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}

	/* FIN TEST SECUENCIAL */
	
	/* INICIO MATULA */
	
	@Test
	public void testProgPobadorNPartitoM() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoMatulaNPartito.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaPorAdyM() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoMatulaAleaPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaProbM() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoMatulaAleaProb.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorAdyM() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoMatulaRegPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorGraM() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoMatulaRegPorGra.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	/* FIN MATULA */
	
	/* INICIO WELSH */
	
	@Test
	public void testProgPobadorNPartitoWp() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoWelshPowellNPartito.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaPorAdyWp() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoWelshPowellAleaPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorAleaProbWp() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoWelshPowellAleaProb.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorAdyWp() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoWelshPowellRegPorAdy.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	@Test
	public void testProgPobadorRegPorGraWp() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoWelshPowellRegPorGra.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}
	
	/*FIN WELSH */
}
