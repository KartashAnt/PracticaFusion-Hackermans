package paquetePrincipal;

public class Mascota {
	private String nombre;
	private int edad;	
	private String color;
	
	private double tamanio;


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
	public String getColor() {
		return color;		
	}

	public void setColor(String color) {
		this.color = color;
	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o, no ademas soy del tamanio "+this.tamanio);
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public void MandarMensaje() {		

		System.out.println("Hola equipo! Soy " + this.nombre + " y te voy a contar algo o no y tengo " + this.edad + ". Soy de color " +this.color + " y ademas soy del tamanio "+this.tamanio);		
	
	}		

}
