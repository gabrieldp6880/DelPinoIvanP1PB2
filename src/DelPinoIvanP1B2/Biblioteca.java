package DelPinoIvanP1B2;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nombre;
	private Prestamo prestamo;
	private ArrayList <Libro> librosPrestados;
	
	public Biblioteca (String n) {
		this.nombre=n;
		librosPrestados = new ArrayList<Libro>();
	}
	
	public void registrarLibroPrestado(Libro l) {
		librosPrestados.add(l);
	}
	
}
