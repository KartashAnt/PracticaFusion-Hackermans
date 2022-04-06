package paquetePrincipal;

public class Principal {


	
	
	


	public static void main(String[] args) {
	
	Mascota mapache = new Mascota("Will Smith");
	
	mapache.MandarMensaje();
	
		
		Perro perro=new Perro("Dave Mustain", "Pastor alemán");
		perro.mandarMensaje();	
		Gato gatoprimero = new Gato("Bola de Nieve V", "Hembra");
		gatoprimero.mandarMensaje();
	
	}



}
