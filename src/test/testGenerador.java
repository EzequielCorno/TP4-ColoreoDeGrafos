package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import miPaquete.GeneradorGrafo;

public class testGenerador {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws FileNotFoundException{
		GeneradorGrafo g1 = new GeneradorGrafo(4);
		g1.regularPorGrado(3);
		g1.imprimirSalida("grafo.in");
	}

}
