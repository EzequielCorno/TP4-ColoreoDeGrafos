package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import miPaquete.GeneradorGrafo;

public class testGenerador {

	/*@Test
	public void testGeneradorRegularPorGrado() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(100);
		g1.regularPorGrado(3);
		g1.imprimirSalida("grafoRegularPorGrado.in");
	}*/
	
	@Test
	public void testGeneradorRegularPorAdyacencia() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(1000);
		g1.regularPorcentajeDeAdyacencia(0.75);
		g1.imprimirSalida("1000_75.in");
	}

	/*@Test
	public void testGeneradorNPartito() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(400);
		g1.nPartito(100);
		g1.imprimirSalida("grafoNPartito.in");
	}
	
	@Test
	public void testGeneradorAleatorioProbabilidad() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(4);
		g1.aleatorioProbabilidad(0.5);
		g1.imprimirSalida("grafoAleatorioProbabilidad.in");
	}
	
	@Test
	public void testGeneradorAleatorioPorcentajeAdyacencia() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(600);
		g1.aleatorioPorcentajeAdyacencia(0.9);
		g1.imprimirSalida("600_90.in");
	}*/
}
