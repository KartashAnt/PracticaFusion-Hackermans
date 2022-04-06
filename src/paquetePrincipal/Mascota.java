package paquetePrincipal;

public class Mascota {
	private String nombre;
	private int edad;
	
	
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Hola equipo soy " + this.nombre + " y te voy a contar algo o no y tengo " + this.edad );
		
	}

}
