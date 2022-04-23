package ar.edu.unju.fi.aplicacion.punto9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Producto> lista = new ArrayList();
          Menu menu= new Menu();
          int opc;
          
          do {
           Scanner entrada = new Scanner(System.in);	
           menu.m();
           opc = entrada.nextInt();  
           switch(opc) {
           case 1:
        	   System.out.println("Ingrese codigo de producto: ");
        	   int codigo= entrada.nextInt();
        	   Scanner en1 = new Scanner(System.in);
        	   System.out.println("Ingrese Descripcion : ");
        	   String descrip = en1.nextLine();
        	   System.out.println("Ingrese precio: ");
        	   double precio = entrada.nextDouble();
        	   System.out.println("Ingrese marca: ");
        	   String marca = en1.nextLine();
        	 
        	   Producto nuevoProducto = new Producto(codigo,descrip,precio,marca);
        	   lista.add(nuevoProducto);
           break;
           case 2:
        	   System.out.println("LISTA DE PRODUCTOS.");
        	   for(Producto o: lista) {
        		   System.out.println("Codigo: "+o.getCodigo());
        		   System.out.println("Descripcion: "+o.getDescripcion());
        		   System.out.println("Marca: "+o.getMarca());
        		   System.out.println("Precio: "+o.getPrecio());
        	   }
           break;
           case 3:
        	   System.out.println("Se incremento 100,25 $ a los precios.");
        	   for(Producto o: lista) {
        		   o.setPrecio(o.getPrecio()+100.25);
        	   }   		   
           break;
           case 4:
          	  double suma=0;
        	   for(Producto o:lista) {
        		  suma=suma + o.getPrecio();
        	   }
        	  System.out.println("La suma de los precios es: "+suma);
           break;
           case 5:
        	   System.out.println("FIN DEL PROGRAMA.");
           break;
           default:
        	   System.out.println("Opcion incorrecta.");
        	break;   
           }
           System.out.println("---------------");
          }while(opc!=5);
          
	}

}
