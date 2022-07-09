package ejercicio6;

/*@author Angel Gabriel Arévalo*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, Double> precioProductos = new HashMap<String, Double>();
        precioProductos.put("Pan", 120d);
        precioProductos.put("Harina", 50d);
        precioProductos.put("Leche", 150d);
        precioProductos.put("Queso", 300d);
        mostrarMap(precioProductos);
        mostrarProductosYPrecio(precioProductos);
        introducirProducto(precioProductos);
        mostrarProductosYPrecio(precioProductos);
        modificarPrecio(precioProductos);
        mostrarProductosYPrecio(precioProductos);
        eliminarProducto(precioProductos);
        mostrarProductosYPrecio(precioProductos);

    }

    public static void mostrarMap(HashMap<String, Double> productos) {
        System.out.println("------------PRODUCTOS Y PRECIO------------------");
        System.out.println(productos);
        System.out.println("------------------------------------");
    }

    public static void mostrarProductosYPrecio(HashMap<String, Double> productos) {
        System.out.println("----------------PRODUCTOS Y PRECIO----------------------");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + ", Precio: $" + value);
        }
        System.out.println("-------------------------------------");
    }

    public static void introducirProducto(HashMap<String, Double> productos) {
        Scanner entrada = new Scanner(System.in);
        String nuevoprod;
        Double precio;
        System.out.println("------------------INTRODUCIR NUEVO PRODUCTO--------------------------------");
        System.out.println("Introducir nombre del producto: ");
        do {
            nuevoprod = entrada.next();
            if (existeProducto(productos, nuevoprod)) {
                System.out.println("El producto que desea ingresar ya existe. Vuelva a intentarlo:");
            }
        } while (existeProducto(productos, nuevoprod));
        System.out.println("Ingrese precio:");
        precio = Double.valueOf(entrada.nextDouble());
        productos.put(nuevoprod, precio);

    }

    public static boolean existeProducto(HashMap<String, Double> productos, String producto) {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (key.equals(producto)) {
                return true;
            }
        }
        return false;
    }

    public static void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("-------------MODIFICAR PRECIO-------------------");
        Scanner entrada = new Scanner(System.in);
        Double nuevoPrecio;
        System.out.println("Ingrese el producto al que desea modificar el precio:");
        String producto;
        do {
            producto = entrada.next();
            if (!existeProducto(productos, producto)) {
                System.out.println("El producto ingresado no existe. Vuelva a intentarlo:");
            }
        } while (!existeProducto(productos, producto));
        System.out.println("Ingrese el nuevo precio del producto:");
        nuevoPrecio=Double.valueOf(entrada.nextDouble());
        productos.replace(producto, nuevoPrecio);
        System.out.println("--------------------------------------------------");
    }

    public static void eliminarProducto(HashMap<String, Double> productos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------ELIMINAR PRODUCTO-----------------------");
        String producto;
        System.out.println("Ingrese el producto que desea eliminar:");
        do{
            producto=entrada.next();
            if(existeProducto(productos, producto)){
                
            }else{
                System.out.println("El producto ingresado no existe. Vuelva a intentarlo:");
            }
        }while(!existeProducto(productos, producto));
        productos.remove(producto);
        System.out.println("---------------------------------------------");
    }
    
}
