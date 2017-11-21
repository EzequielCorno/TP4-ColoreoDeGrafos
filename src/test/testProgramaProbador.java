package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import miPaquete.GrafoNDNP;
import programaprobador.ProgramaProbador;

public class testProgramaProbador {

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

}
