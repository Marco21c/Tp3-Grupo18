package ar.edu.unju.fi.aplicacion.punto7;

import java.util.ArrayList;
import java.util.Scanner;

public class punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     ArrayList<String> lista = new ArrayList();  
     char resp; 
     
     do {
	 Scanner entrada = new Scanner(System.in);	
	 System.out.println("Ingrese nombre de la fruta: ");	 
	 lista.add(entrada.next());	 
	 System.out.println("Desea ingresar mas datos? (S/N) :");
	 resp = entrada.next().charAt(0);
	 }while(resp=='S' || resp=='s');
     
	 System.out.println("Frutas en indices par.");
     for(int i=0;i<lista.size();i++){
    	if(i%2==0) 
    	 System.out.println(lista.get(i));
     }
    //validacion del indice de la lista
     int eliminado=0;
     do {	
   	 //mensaje informativo por si repite el bucle 
      if(eliminado<0 || eliminado>=lista.size())
    	   System.out.println("Debe ingresar un indice valido.");
      
     Scanner indice = new Scanner(System.in);
   	 System.out.println("Ingrese un indice para eliminar: ");
   	 eliminado = indice.nextInt();
     
     }while(eliminado<0 || eliminado>=lista.size());
     //Eliminacion de string en el indice indicado
   	 System.out.println("Se elimino " + lista.get(eliminado) );
     lista.remove(eliminado);
     
     //Se muestra la lista y cantidad
   	 System.out.println("Cantidad de elementos de la lista: "+lista.size());
   	 for(String fruta: lista){
   	   	 System.out.println(fruta);
   	 }
	}
 
    
}