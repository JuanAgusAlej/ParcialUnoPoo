import Directivo.Directivo;
import Empleado.Empleado;
import Medico.Medico;
import Oficial.Oficial;
import Tecnico.Tecnico;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void imprimir(Empleado empl) {
		empl.imprime_cargo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oficial Rafa = new Oficial();
		Tecnico Miguel = new Tecnico();
		Directivo Gabriel = new Directivo();
		
		System.out.println("Rafa");
		imprimir(Rafa);
		System.out.println("Miguel");
		imprimir(Miguel);
		System.out.println("Gabriel");
		imprimir(Gabriel);
		
		Medico Cosme = new Medico("Cosme", 23);
		Medico Damian  = new Medico("Damián", 243);
	}

}
