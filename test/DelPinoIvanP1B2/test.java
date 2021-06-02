package DelPinoIvanP1B2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class test {
	
	
	@Test
	public void queSePuedaPrestarUnLibroYaDevuelto (){
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Libro l1 = new Libro (341, "Libro de Matematica", "Newton");
		Estudiante ivan = new Estudiante (36987321, "Del Pino", "Ivan");
		Estudiante carlos = new Estudiante (36876230, "Rodriguez", "Carlos");
		
		b1.hacerPrestamo(1234, ivan, l1);
		
		ivan.devolverLibro(b1, l1);
		
		b1.hacerPrestamo(3424, carlos, l1);
		
	}
	
	@Test
	public void queNoSePuedaHacerPrestamoPorLibroNoDisponible () {
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Libro l1 = new Libro (341, "Libro de Matematica", "Newton");
		Estudiante ivan = new Estudiante (36987321, "Del Pino", "Ivan");
		Estudiante carlos = new Estudiante (36876230, "Rodriguez", "Carlos");
		
		b1.hacerPrestamo(1234, ivan, l1);
		
		assertFalse(b1.hacerPrestamo(3424, carlos, l1));
		
	}
	
	@Test
	public void queBibliotecaPuedaFotocopiarLibrosDeHistoria () {
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Historia l1 = new Historia (341, "Libro de historia", "San Martin");
		
		assertEquals("Historia",b1.imprimirLibroHistoria(l1));
	}
	
	@Test
	public void queBibliotecaPuedaFotocopiarLibrosDeGeografia () {
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Geografia l1 = new Geografia (341, "Libro de geografia", "Colon");
		
		assertEquals("Geografia",b1.imprimirLibroGeografia(l1));
	}
	
	@Test
	public void queSeRegistreElPrestamoEnLaLista () {
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Libro l1 = new Libro (341, "Libro de Matematica", "Newton");
		Estudiante ivan = new Estudiante (36987321, "Del Pino", "Ivan");
		Estudiante carlos = new Estudiante (36876230, "Rodriguez", "Carlos");
		
		b1.hacerPrestamo(1234, ivan, l1);
		
		Prestamo p1 = b1.getListaPrestamos().get(0);
		
		assertEquals("Libro de Matematica",p1.getLibro().getNombre());
		
	}
	
	@Test
	public void queNoSePuedaPrestarMasDe2LibrosEstudiante (){
		Biblioteca b1 = new Biblioteca ("Biblioteca Nacional");
		Libro l1 = new Libro (341, "Libro de Matematica", "Newton");
		Geografia l2 = new Geografia (342, "Libro de geografia", "Colon");
		Historia l3 = new Historia (343, "Libro de historia", "San Martin");
		
		Estudiante ivan = new Estudiante (36987321, "Del Pino", "Ivan");
		
		b1.hacerPrestamo(1234, ivan, l1);
		b1.hacerPrestamo(342, ivan, l2);
		
		
		assertFalse(b1.hacerPrestamo(343, ivan, l3));
		
	}
	
}
