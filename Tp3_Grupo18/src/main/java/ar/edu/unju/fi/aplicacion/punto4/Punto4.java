package ar.edu.unju.fi.aplicacion.punto4;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arreglo = new int[8];
    
    for(int i=0;i<arreglo.length;i++) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Ingrese un numero: ");
    	arreglo[i]= entrada.nextInt();
    }
    for(int i:arreglo){
     String aux;	
    	if(i%2==0)
    	  aux= "Par";
    	else 
    	  aux = "Impar";
    	System.out.println(i +" es "+aux);
	}

}
}