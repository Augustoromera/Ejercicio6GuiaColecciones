package productos.servicio;

import java.util.Scanner;
import productos.entidades.Productos;

public class ProductosServicio {
   public Productos crearProducto(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
   String nombre="";
   Double precio=0.0;
       System.out.println("ingrese el nombre del producto");
       nombre=leer.next();
       System.out.println("Ingrese el precio del producto");
       precio=leer.nextDouble();
       return new Productos(nombre, precio);
   }
}
