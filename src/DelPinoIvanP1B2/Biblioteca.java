package DelPinoIvanP1B2;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nombre;
	private Prestamo prestamo;
	private ArrayList <Prestamo> listaPrestamos;
	
	public Biblioteca (String n) {
		this.nombre=n;
		listaPrestamos = new ArrayList<Prestamo>();
	}
	
	public void disponibilizaLibro (Libro l) {
		l.setEstado(true);
	}
	
	public boolean hacerPrestamo (Integer id, Estudiante e, Libro l) {
		if(e.getLibrosAdquiridos().size() < 2 && l.getEstado()==true) {
			Prestamo pres = new Prestamo (id,e,l);
			listaPrestamos.add(pres);
			e.getLibrosAdquiridos().add(l);
			return true;
		}
		return false;
	}
	
	public String imprimirLibroHistoria (Historia l) {
		return l.fotocopiar();
	}
	
	public String imprimirLibroGeografia (Geografia l) {
		return l.fotocopiar();
	}
	
	
}
