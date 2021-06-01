package DelPinoIvanP1B2;

public class Prestamo {
	
	private Integer identificador;
	private Estudiante estudiante;
	private Libro libro;
	
	public Prestamo (Integer id, Estudiante e, Libro l) {
		this.identificador = id;
		this.estudiante = e;
		this.libro=l;
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
}
