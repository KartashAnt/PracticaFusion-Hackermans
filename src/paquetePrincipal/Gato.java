package paquetePrincipal;

public class Gato extends Mascota {

	//----Atributo-----//
	
	
	private String Genero="";
	
	
	//----Metodo----//
	
	
	public void mandarMensaje() {
		
		System.out.println("Homer Simpson tiene un gato llamado "+this.getNombre()+"y su apodo es "+Genero);
		
	}
	//----Constructor---//

	public Gato(String nombre, String genero) {
		super(nombre);
		Genero = genero;
	}
	//-----Setter & Getter----//
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}	
	
}
