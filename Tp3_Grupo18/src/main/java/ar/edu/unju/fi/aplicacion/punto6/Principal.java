package ar.edu.unju.fi.aplicacion.punto6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] arreglo = new int [10];
		
		for (int i=arreglo.length; i>0;i--) {
			System.out.println("ingrese numero ");
			arreglo[i-1]=scanner.nextInt();
		}
		
		for (int j=0;j<arreglo.length;j++) {
			System.out.println(arreglo[j]);
		}
	}

}
