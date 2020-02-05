package ejempcomparable;

import java.util.Comparator;
import java.util.Hashtable;

public class ComparadorColorOjos implements Comparator<Empleado> {
	
	static Hashtable<String, Integer> ordenColores; 
	
	
   public ComparadorColorOjos() {
	   ordenColores = new Hashtable<>();
	   ordenColores.put("negro", 4);
	   ordenColores.put("azul", 2);
	   ordenColores.put("verde", 3);
	   ordenColores.put("marron", 1);
	   ordenColores.put("castaño", 5);
	   
	   
   }
	@Override
	public int compare(Empleado emp1, Empleado emp2) {
		return ordenColores.get(emp1.getColorOjos()) - ordenColores.get(emp2.getColorOjos());
		
	}
	
	

}
