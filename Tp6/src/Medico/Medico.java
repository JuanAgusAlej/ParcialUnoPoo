package Medico;

import Empleado.Empleado;
import Habilidades.Habilidades;

public class Medico extends Empleado{
	
	private Habilidades quinto;
	private String name;
	private int matricula;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Medico(String name, int matricula) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setMatricula(matricula);
	}
	
	public void imprime_cargo() {
		System.out.println("Es un operario Medico");
	}
	
}
