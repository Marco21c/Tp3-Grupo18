package ar.edu.unju.fi.aplicacion.punto3;

public class Alumno {
	private String nombre;
	private String apellido;
	private String lu;
	private double [] nota = new double [5];
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido, String lu, double[] nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.lu = lu;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLU() {
		return lu;
	}
	public void setLu(String lu) {
		this.lu = lu;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	public double promedio(double [] nota) {
		double suma=0;
		int contador=0;
		for(int i=0; i<nota.length;i++) {
			suma = suma + nota[i];
			contador++;
		}
		
		return suma/contador;
	}
	
	public double obtenerNotaMaxima(double [] nota) {
		double max = nota[0];
		for(int i=1; i<nota.length;i++) {
			if (nota[i] > max) {
				max = nota[i];
			}
		}
		return max;
	}
}
