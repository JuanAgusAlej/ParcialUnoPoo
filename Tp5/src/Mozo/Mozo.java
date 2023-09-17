package Mozo;

import Empleado.Empleado;

public class Mozo extends Empleado {
	private double propinas;
	public Mozo() {
		this.id=0;
		this.name="";
		this.sueldo=0;
	}
	public Mozo(int id, String name, double sueldo) {
		this.id = id;
		this.name = name;
		this.sueldo = sueldo;
	}
	public double getPropinas() {
		return propinas;
	}
	public void setPropinas(double propinas) {
		this.propinas = propinas;
	}
	public void averiguarSueldo() {
		System.out.println("El salario del Cajero: " + this.name + " es "  + (this.propinas + this.sueldo) );
	}
}
