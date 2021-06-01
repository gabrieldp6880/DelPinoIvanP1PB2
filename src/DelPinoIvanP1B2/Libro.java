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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
}
