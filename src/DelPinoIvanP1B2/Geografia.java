package DelPinoIvanP1B2;

public class Geografia extends Libro implements IFotocopiable {

	public Geografia(Integer c, String n, String a) {
		super(c, n, a);
	}

	@Override
	public String fotocopiar() {
		return this.getClass().getSimpleName();
	}

}
