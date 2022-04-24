package ar.edu.unju.fi.aplicacion.punto2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arreglo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner scanner = new Scanner(System.in);
		String resp="s";
		int numero;
		//comparacion de cadena metodos de comparacion String
		while (resp.equals("s")) {
			System.out.println("ingrese numero");
			numero = scanner.nextInt();
			if (numero >= 0 && numero <= 10) {
				for (int i=0; i<arreglo.length;i++) {
					int multi = numero * arreglo[i];
					System.out.println(numero+" x "+arreglo[i]+" = "+multi);
				}
			}
			else 
			{
				System.out.println("numero ingresado fuera de rango");
			}
			
			System.out.println("desea ingresar otro numero: S/N");
			resp = scanner.next();
		}
		System.out.println("fin del programa");
	}

}
