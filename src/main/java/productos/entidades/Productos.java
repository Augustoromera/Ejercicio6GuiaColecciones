
package productos.entidades;
public class Productos {
    String nombre;
    Double precio;

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Productos(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Productos() {
    }
    
}
