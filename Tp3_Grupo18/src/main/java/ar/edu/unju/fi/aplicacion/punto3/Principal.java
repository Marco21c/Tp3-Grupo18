package ar.edu.unju.fi.aplicacion.punto3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		System.out.println("ingrese nombre ");
		String n = scanner.next();
		alumno.setNombre(n);
		System.out.println("ingrese Apellido ");
		String a = scanner.next();
		alumno.setApellido(a);
		System.out.println("ingrese Libreta universitaria ");
		String l = scanner.next();
		alumno.setLu(l);;
		System.out.println("ingrese las notas ");
		
		for (int i=0; i<alumno.getNota().length;i++) {
			alumno.getNota()[i] = scanner.nextDouble();
		}
		
		//recorrido comprobar carga de datos en el arreglo de notas
		/*for (int j=0; j<alumno.getNota().length;j++) {
			System.out.println("la posicion "+j+" = "+alumno.getNota()[j]);
		}
		*/
		System.out.println("El promedio es: "+alumno.promedio(alumno.getNota()));
		
		System.out.println("la nota maxima es: "+alumno.obtenerNotaMaxima(alumno.getNota()));
	}

}
