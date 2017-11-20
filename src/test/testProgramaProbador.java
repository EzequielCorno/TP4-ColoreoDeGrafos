package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import miPaquete.GrafoNDNP;
import programaprobador.ProgramaProbador;

public class testProgramaProbador {

	@Test
	public void testProgPobador() throws FileNotFoundException {
		GrafoNDNP g1 = new GrafoNDNP("grafoNPartito.in");
		ProgramaProbador p1 = new ProgramaProbador(g1.getGrafo(), "grafoColoreadoSecuencial.out");
		if(p1.valido())
			System.out.println("Esta bien coloreado.");
		else System.out.println("Esta mal coloreado.");
	}

}
