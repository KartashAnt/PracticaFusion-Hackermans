package paquetePrincipal;

public class Perro extends Mascota{
	private String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	public void mandarMensaje() {
		System.out.println("Hello me, meet the real me\n"
						+ "And my misfit's way of life\n"
						+ "A dark, black past is my\n"
						+ "Most valued possession");
	}
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
}
