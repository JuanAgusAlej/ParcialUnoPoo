import Cajero.Cajero;
import Empleado.Empleado;
import Mozo.Mozo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void preguntarSueldo (Empleado emp) {
		emp.averiguarSueldo();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cajero cajeroUno = new Cajero(1,"Pedro", 35.25);
		Mozo mozoUno = new Mozo(1, "Juan", 20.50);
		
		mozoUno.setPropinas(10.5);
		
		preguntarSueldo(mozoUno);
		preguntarSueldo(cajeroUno);
		
	}

}
