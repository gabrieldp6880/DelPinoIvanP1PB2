package DelPinoIvanP1B2;

import java.util.ArrayList;

public class Estudiante {
	
	private Integer dni;
	private String apellido;
	private String nombre;
	private ArrayList <Libro> librosAdquiridos;
	
	public Estudiante (Integer dni, String a, String n) {
		this.dni=dni;
		this.apellido=a;
		this.nombre=n;
		librosAdquiridos = new ArrayList <Libro>();
	}
	
	public void devolverLibro (Biblioteca b, Libro l) {
		b.disponibilizaLibro(l);
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList <Libro> getLibrosAdquiridos() {
		return librosAdquiridos;
	}

	public void setLibrosAdquiridos(ArrayList <Libro> librosAdquiridos) {
		this.librosAdquiridos = librosAdquiridos;
	}
	
	
}
