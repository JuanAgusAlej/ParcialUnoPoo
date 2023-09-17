package Cajero;

import Empleado.Empleado;

public class Cajero extends Empleado {
	
	public Cajero() {
		this.sueldo = 0;
		this.id = 0;
		this.name = "";
	}
	public Cajero(int id, String name, double sueldo) {
		this.sueldo = sueldo;
		this.id = id;
		this.name = name;
	}
	public void averiguarSueldo() {
		System.out.println("El salario del Cajero: " + this.name + " es "  + this.sueldo );
	}
}
