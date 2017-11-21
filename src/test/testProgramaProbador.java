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
			System.out.println("Esta bien coloreado.1");
		else System.out.println("Esta mal coloreado.1");
	}
	
	@Test
	public void testProgPobadorAleaPorAdy() throws FileNotFoundException {
		GrafoNDNP g2 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p2= new ProgramaProbador(g2.getGrafo(), "grafoColoreadoSecuencialAleaPorAdy.out");
		if(p2.valido())
			System.out.println("Esta bien coloreado.2");
		else System.out.println("Esta mal coloreado.2");
	}
	
	@Test
	public void testProgPobadorAleaProb() throws FileNotFoundException {
		GrafoNDNP g3= new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p3 = new ProgramaProbador(g3.getGrafo(), "grafoColoreadoSecuencialAleaProb.out");
		if(p3.valido())
			System.out.println("Esta bien coloreado.3");
		else System.out.println("Esta mal coloreado.3");
	}
	
	@Test
	public void testProgPobadorRegPorAdy() throws FileNotFoundException {
		GrafoNDNP g4 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p4 = new ProgramaProbador(g4.getGrafo(), "grafoColoreadoSecuencialRegPorAdy.out");
		if(p4.valido())
			System.out.println("Esta bien coloreado.4");
		else System.out.println("Esta mal coloreado.4");
	}
	
	@Test
	public void testProgPobadorRegPorGra() throws FileNotFoundException {
		GrafoNDNP g5 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p5 = new ProgramaProbador(g5.getGrafo(), "grafoColoreadoSecuencialRegPorGra.out");
		if(p5.valido())
			System.out.println("Esta bien coloreado.5");
		else System.out.println("Esta mal coloreado.5");
	}

	/* FIN TEST SECUENCIAL */
	
	/* INICIO MATULA */
	
	@Test
	public void testProgPobadorNPartitoM() throws FileNotFoundException {
		GrafoNDNP g6 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p6 = new ProgramaProbador(g6.getGrafo(), "grafoColoreadoMatulaNPartito.out");
		if(p6.valido())
			System.out.println("Esta bien coloreado.6");
		else System.out.println("Esta mal coloreado.6");
	}
	
	@Test
	public void testProgPobadorAleaPorAdyM() throws FileNotFoundException {
		GrafoNDNP g7 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p7 = new ProgramaProbador(g7.getGrafo(), "grafoColoreadoMatulaAleaPorAdy.out");
		if(p7.valido())
			System.out.println("Esta bien coloreado.7");
		else System.out.println("Esta mal coloreado.7");
	}
	
	@Test
	public void testProgPobadorAleaProbM() throws FileNotFoundException {
		GrafoNDNP g8 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p8 = new ProgramaProbador(g8.getGrafo(), "grafoColoreadoMatulaAleaProb.out");
		if(p8.valido())
			System.out.println("Esta bien coloreado.8");
		else System.out.println("Esta mal coloreado.8");
	}
	
	@Test
	public void testProgPobadorRegPorAdyM() throws FileNotFoundException {
		GrafoNDNP g9 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p9 = new ProgramaProbador(g9.getGrafo(), "grafoColoreadoMatulaRegPorAdy.out");
		if(p9.valido())
			System.out.println("Esta bien coloreado.9");
		else System.out.println("Esta mal coloreado.9");
	}
	
	@Test
	public void testProgPobadorRegPorGraM() throws FileNotFoundException {
		GrafoNDNP g10 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p10 = new ProgramaProbador(g10.getGrafo(), "grafoColoreadoMatulaRegPorGra.out");
		if(p10.valido())
			System.out.println("Esta bien coloreado.10");
		else System.out.println("Esta mal coloreado.10");
	}
	
	/* FIN MATULA */
	
	/* INICIO WELSH */
	
	@Test
	public void testProgPobadorNPartitoWp() throws FileNotFoundException {
		GrafoNDNP g11 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p11 = new ProgramaProbador(g11.getGrafo(), "grafoColoreadoWelshPowellNPartito.out");
		if(p11.valido())
			System.out.println("Esta bien coloreado.11");
		else System.out.println("Esta mal coloreado.11");
	}
	
	@Test
	public void testProgPobadorAleaPorAdyWp() throws FileNotFoundException {
		GrafoNDNP g12 = new GrafoNDNP("grafoAleatorioPorcentajeAdyacencia.in");
		ProgramaProbador p12 = new ProgramaProbador(g12.getGrafo(), "grafoColoreadoWelshPowellAleaPorAdy.out");
		if(p12.valido())
			System.out.println("Esta bien coloreado.12");
		else System.out.println("Esta mal coloreado.12");
	}
	
	@Test
	public void testProgPobadorAleaProbWp() throws FileNotFoundException {
		GrafoNDNP g13 = new GrafoNDNP("grafoAleatorioProbabilidad.in");
		ProgramaProbador p13 = new ProgramaProbador(g13.getGrafo(), "grafoColoreadoWelshPowellAleaProb.out");
		if(p13.valido())
			System.out.println("Esta bien coloreado.13");
		else System.out.println("Esta mal coloreado.13");
	}
	
	@Test
	public void testProgPobadorRegPorAdyWp() throws FileNotFoundException {
		GrafoNDNP g14 = new GrafoNDNP("grafoRegularPorAdyacencia.in");
		ProgramaProbador p14 = new ProgramaProbador(g14.getGrafo(), "grafoColoreadoWelshPowellRegPorAdy.out");
		if(p14.valido())
			System.out.println("Esta bien coloreado.14");
		else System.out.println("Esta mal coloreado.14");
	}
	
	@Test
	public void testProgPobadorRegPorGraWp() throws FileNotFoundException {
		GrafoNDNP g15 = new GrafoNDNP("grafoRegularPorGrado.in");
		ProgramaProbador p15 = new ProgramaProbador(g15.getGrafo(), "grafoColoreadoWelshPowellRegPorGra.out");
		if(p15.valido())
			System.out.println("Esta bien coloreado.15");
		else System.out.println("Esta mal coloreado.15");
	}
	
	/*FIN WELSH */
}
