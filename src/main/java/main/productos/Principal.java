package main.productos;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import productos.entidades.Productos;
import productos.servicio.ProductosServicio;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> ProductosLista = new HashMap();
        ProductosServicio ps = new ProductosServicio();
        int respuestaMenu = 0;
        String res = "";
        String respuestaWhile = "";
        do {
            System.out.println("---------- Menuu:)----------------");
            System.out.println("1: Cargar un producto con su precio  ");
            System.out.println("2: Modificar el precio de un producto");
            System.out.println("3: Eliminar un producto              ");
            System.out.println("4: Mostrar la lista de productos     ");
            System.out.print("Ingrese su respuesta ");
            respuestaMenu = leer.nextInt();

            switch (respuestaMenu) {
                case 1: {
                    do {
                        Productos p = ps.crearProducto();
                        ProductosLista.put(p.getNombre(), p.getPrecio());
                        System.out.println("Desea seguir ingresando");
                        res = leer.next();
                    } while (res.equalsIgnoreCase("si"));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del producto que desea modificar el precio");
                    String respuestaCase2 = leer.next();
                    for (Map.Entry<String, Double> aux : ProductosLista.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        if (key.equalsIgnoreCase(respuestaCase2)) {
                            System.out.println("ingrese el nuevo precio(recuerde usar la coma en vez del punto)");
                            value = leer.nextDouble();
                            System.out.println("--Precio modificado--");
                            System.out.println("--Su nuevo precio es: " + value + "--");
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Ingrese el producto que desea eliminar");
                    String respuestaCase3="";
                    respuestaCase3=leer.next();
                    for (Map.Entry<String, Double> aux : ProductosLista.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        if(respuestaCase3.equals(key)){
                        ProductosLista.remove(key);
                        System.out.println("--Su producto fue re eliminado--");
                    break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Mostrando la lista de los productos");
                    for (Map.Entry<String, Double> aux : ProductosLista.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("Clave: "+key+" valor: "+value);
                    }
                }

            }
            System.out.println("Desea seguir en el menu?");
            respuestaWhile = leer.next();
        } while (respuestaWhile.equalsIgnoreCase("Si"));
    }

}
