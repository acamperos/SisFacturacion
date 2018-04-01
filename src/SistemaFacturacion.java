
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSanchez
 * Clase principal para agrupar las clases y generar el sistema de facturacion
 */
public class SistemaFacturacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner, para poder registrar o tomar los datos del teclado
        String opcion="S";
        System.out.println("*************************************************************");
        System.out.println("*************** SISTEMA DE FACTURACIÓN ********************* ");
        System.out.println("*************************************************************");
        System.out.println("");   
    
      do{
////////////////////Inicio de Registro de los datos del cliente     
                System.out.println("Ingrese nro de identificación del cliente: ");
                int cedula=sc.nextInt();               
                System.out.println("Ingrese nombre del cliente: ");
                String nombreCliente=sc.next();
                Client client=new Client(cedula,nombreCliente); //se crea el objeto cliente                

////////////////////Inicio de Registro de los datos de la mesa y cantidad de personas                 
                System.out.println("Ingrese nombre de la mesa :");
                String mesa=sc.next();
                System.out.println("Ingrese cantidad de personas para la mesa :");
                int catidadSillas=sc.nextInt();
                Table table=new Table(mesa, catidadSillas);//se crea el objeto mesa o table

////////////////////Inicio de Registro de los datos de los productos a consumir    
                System.out.println("Ingrese cantidad de platos o productos a consumir :");
                int catidadProductos=sc.nextInt();
                
                List<Product> listProducts =new ArrayList<Product>();
                for (int i=0;i<catidadProductos;i++)
                {
                    System.out.println("Ingrese nombre del producto :"+(i+1));
                    String nombreProducto=sc.next();
                    System.out.println("Ingrese el costo del producto :"+(i+1));
                    Double costProducto=sc.nextDouble();
                    Product prod= new Product( nombreProducto, costProducto);  
                    listProducts.add(prod);
                }
////////////////////Inicio de Registro de la facturacion                                 
                Factura factura=new Factura( new Date(), table, client, listProducts);//se crea el objeto factura
                
                factura.facturar();// se invoca el metodo facturar, el cual calcula e invoca los metodos de los calculos de servicios e impuestos
                
                 System.out.println("Desea facturar otro cliente ? S/N ");
                 opcion=sc.next();  
                
      }while(opcion.equalsIgnoreCase("S")); 
      
      
 }
     
}
