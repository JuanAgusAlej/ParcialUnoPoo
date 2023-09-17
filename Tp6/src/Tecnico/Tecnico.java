package Tecnico;

import Empleado.Empleado;
import Habilidades.Habilidades;

public class Tecnico extends Empleado{
	
	private Habilidades cuarto;
	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	
	public void imprime_cargo() {
		System.out.println("Es un operario Tecnico");
	}
	
}
