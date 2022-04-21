
package ar.edu.unju.fi.aplicacion.Punto1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arreglo1 = new int[5];
       int[] arreglo2 = new int [5];
       Scanner entrada = new Scanner(System.in);
       System.out.println("Arreglo 1");
       for(int i=0 ;i<5;i++) {
    	   System.out.println("Ingrese un numero entero: ");
    	   arreglo1[i] = entrada.nextInt();
       }
       System.out.println("Arreglo 2 ");
       for(int i=0;i<5;i++) {
    	   System.out.println("Ingrese un numero entero: ");
    	   arreglo2[i] = entrada.nextInt();
       }
       System.out.println("Divisiones ");
    Mostrar div = new Mostrar();
     div.division(arreglo1, arreglo2);
	
	}
}
