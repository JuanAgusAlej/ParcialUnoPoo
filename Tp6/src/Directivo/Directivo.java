package Directivo;

import Empleado.Empleado;
import Habilidades.Habilidades;

public class Directivo extends Empleado {

	private Habilidades uno;
	
	public Directivo() {
		// TODO Auto-generated constructor stub
	}
	public void imprime_cargo() {
		System.out.println("Es un operario Directivo");
	}

}
