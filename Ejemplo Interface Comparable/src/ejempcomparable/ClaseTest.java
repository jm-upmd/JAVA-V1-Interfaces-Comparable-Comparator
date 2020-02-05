package ejempcomparable;

import java.awt.Image;
import java.util.Arrays;

public class ClaseTest {
	static Empleado[] empleados;
	
	public static void main(String[] args) {

		 empleados = new Empleado[5];

		empleados[0] = new Empleado("Jose", "Sanchez", 2500f, 40, "verde");
		empleados[1] = new Empleado("María", "Hueta", 3000f, 45, "azul");
		empleados[2] = new Empleado("Verónica", "Muñoz", 1800.48f, 30, "negro");
		empleados[3] = new Empleado("Antonio", "Martínez", 1600.19f, 35, "marron");
		empleados[4] = new Empleado("Marcos", "Pérez", 2500f, 20, "castaño");
		
		
		
		
		

		// Como el objeto de tipo Empleado implementa el interface Comparable el método
		// sort ordenará según el método compareTo implementado en el.
		Arrays.sort(empleados);
		imprme("Lista ordenada por EDAD");
		
		// Versión de Arrays.sort que recoge como sengundo parámetro on interface Comparator
		// y ordena según lógina de su método compare.

		Arrays.sort(empleados,new ComparadorSalario());
		imprme("Lista Ordenada por SALARIO");
		
		Arrays.sort(empleados,new ComparadorColorOjos());
		imprme("Lista Ordenada por COLOR DE OJOS");

	}
	
	static void imprme(String cabecera) {
		System.out.println("\n" + cabecera + "\n");
		System.out.printf("%-15s  %15s  %15s  %-15s\n", "NOMBRE", "SALARIO", "EDAD", "COLOR OJOS");

		for (Empleado e : empleados) {
			System.out.printf("%-15s  %15.2f  %15d  %-15s\n", e.getNombre(), e.getSalario(), e.getEdad(),
					e.getColorOjos());

		}
	}
		
		
		

}
