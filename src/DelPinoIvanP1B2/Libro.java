package DelPinoIvanP1B2;

public class Libro {
	
	private Integer codigo;
	private String nombre;
	private String autor;
	private Boolean estado;
	
	public Libro (Integer c, String n, String a) {
		this.codigo=c;
		this.nombre=n;
		this.autor=a;
		this.estado=true; //disponible para prestar
	}
	
	
	
}
