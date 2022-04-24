package ar.edu.unju.fi.aplicacion.punto8;
import ar.edu.unju.fi.aplicacion.punto3.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> lista = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		int num;
		String resp;
		boolean band = true;
		while (band == true) {
		
		System.out.println("-----ELIGA LA SIGUIENTE OPCION -----");
		System.out.println("1- NUEVO ALUMNO");
		System.out.println("2- ELIMINAR ALUMNO");
		System.out.println("3- MODIFICAR NOTAS ALUMNO");
		System.out.println("4- MOSTRAR TODOS LOS ALUMNOS");
		System.out.println("5- MOSTRAR MAYOR PROMEDIO DE 6");
		System.out.println("6- SALIR");
		num = +scanner.nextInt();
		
		switch (num) {
		case 1:
			Alumno nuevoAlumno = new Alumno();
			System.out.println("ingrese nombre ");
			String n = scanner.next();
			nuevoAlumno.setNombre(n);
			System.out.println("ingrese Apellido ");
			String a = scanner.next();
			nuevoAlumno.setApellido(a);
			System.out.println("ingrese Libreta universitaria ");
			String l = scanner.next();
			nuevoAlumno.setLu(l);;
			System.out.println("ingrese las notas ");
			
			for (int i=0; i<nuevoAlumno.getNota().length;i++) {
				nuevoAlumno.getNota()[i] = scanner.nextDouble();
			}
			
			lista.add(nuevoAlumno);
			
			break;
		case 2:
			System.out.println("ingrese libreta universitaria");
			resp = scanner.next();
			for (int i=0; i<lista.size();i++) {
				Alumno ap = lista.get(i);
				if (ap.getLU().equals(resp)) {
					lista.remove(i);
				}
			}
			break;
		case 3:
			System.out.println("ingrese libreta universitaria");
			resp = scanner.next();
			for (int i=0; i<lista.size();i++) {
				Alumno am = lista.get(i);
				if (am.getLU().equals(resp)) {
					for (int j=0;j<am.getLU().length();j++) {
						System.out.println("ingrese las notas");
						am.getNota()[j]=scanner.nextDouble();
					}
				}
				else {
					System.out.println("no existe alumno con LU ingresado");
				}
			}
			break;
		case 4:
			for (Alumno al: lista) {
				System.out.println(al.getNombre()+" "+al.getApellido());
			}
			break;
		case 5:
			for (Alumno al: lista) {
				if (al.promedio(al.getNota()) > 6) {
					System.out.println(al.getNombre()+"tiene promedio "+al.promedio(al.getNota()));
				}
				
			}
			break;
		case 6:
			System.out.println("salir");
			band = false;
		default:
			System.out.println("fin del programa");
		}
		
	}
	}

}
