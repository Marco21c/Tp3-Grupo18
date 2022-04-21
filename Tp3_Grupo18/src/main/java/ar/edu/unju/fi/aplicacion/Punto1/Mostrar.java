package ar.edu.unju.fi.aplicacion.Punto1;

public class Mostrar {
   
	public void division(int[] arreglo1,int[] arreglo2) {
		for(int i=0;i<5;i++) {
			try {
			int aux = arreglo1[i]/arreglo2[i];
		 	System.out.println(arreglo1[i]+ " / " +arreglo2[i]+" es: " +aux);
		    }catch(ArithmeticException ee) {
			System.out.println("No se puede dividir en 0.");
		}
		}	
	}

	
}
