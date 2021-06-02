package DelPinoIvanP1B2;

public class Historia extends Libro implements IFotocopiable {

	
	
	public Historia(Integer c, String n, String a) {
		super(c, n, a);
	}

	@Override
	public String fotocopiar() {
		return this.getClass().getSimpleName();
	}

}
