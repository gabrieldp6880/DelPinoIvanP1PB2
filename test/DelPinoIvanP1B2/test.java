package DelPinoIvanP1B2;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class test {
	
	
	@Test
	public void queNoSePuedaHacerPrestamoPorLibroNoDisponible () {
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Libro l1 = new Libro (341, "Libro de Matematica", "Newton");
		Estudiante Ivan = new Estudiante (36987321, "Del Pino", "Ivan");
		Estudiante Carlos = new Estudiante (36876230, "Rodriguez", "Carlos");
		
		b1.hacerPrestamo(1234, Ivan, l1);
		
		assertFalse(b1.hacerPrestamo(3424, Carlos, l1));
		
	}
	
}
