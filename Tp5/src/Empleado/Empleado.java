package Empleado;

public class Empleado {
	
	
	protected double sueldo;
	protected int id;
	protected String name;
	
	public 
	Empleado() {
		this.sueldo =0;
		this.id = 0;
		this.name = "";
	}
	Empleado(int id, double sueldo, String name) {
		this.name = name;
		this.sueldo = sueldo;
		this.id = id;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public void averiguarSueldo() {
		System.out.println("El saliario de "+ this.name+ " es: "+ this.sueldo);
	}
}
