package ejercicio1;

// @author Angel Arévalo
import ejercicio1.entidades.CantanteFamoso;
import java.util.*;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();
        cantantes.add(new CantanteFamoso("La Renga", "Balada del Diablo"));
        cantantes.add(new CantanteFamoso("El Justin", "Baby"));
        cantantes.add(new CantanteFamoso("Tiago PZK", "Entre Nosotros"));
        cantantes.add(new CantanteFamoso("Duko", "Malbec"));
        cantantes.add(new CantanteFamoso("Billie Einlish", "Happier Than Ever"));
        mostrarArrayList(cantantes);
        int opcion;
        do {
            System.out.println("Menú: \n1: Agregar cantante.\n2: Editar cantante.\n3: Eliminar cantante.\n4: Salir.");
            opcion = validarOpcion();
            String nuevocantante;
            switch (opcion) {
                case 4:
                    System.out.println("---------------------FIN DEL PROGRAMA---------------------------");
                    break;
                case 1:
                    agregarCantante(cantantes);
                    mostrarArrayList(cantantes);
                    break;
                case 2:
                    System.out.println("Ingrese el cantante que desea modificar:");
                    nuevocantante = entrada.next();
                    editarCantante(cantantes, nuevocantante);
                    mostrarArrayList(cantantes);
                    break;
                case 3:
                    System.out.println("Ingrese el cantante que desea eliminar:");
                    nuevocantante = entrada.next();
                    eliminarCantante(cantantes, nuevocantante);
                    mostrarArrayList(cantantes);
                    break;
            }
        } while (opcion != 4);

    }

    public static void mostrarArrayList(ArrayList<CantanteFamoso> cf) {
        System.out.println("---------------------CANTANTES Y DISCO--------------------------");
        cf.forEach(x -> System.out.println(x.toString()));
        System.out.println("-------------------------------------------");
    }

    public static int validarOpcion() {
        System.out.println("Ingrese una opción:");
        String opcion;
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        do {
            opcion = entrada.next();
            if (!opcion.matches("[1-4]")) {
                System.out.println("Opción ingresada invalida. Vuelva a ingresarla!!");
            }
        } while (!opcion.matches("[1-4]"));
        int retopcion = Integer.parseInt(opcion);
        return retopcion;
    }

    public static void agregarCantante(ArrayList<CantanteFamoso> cf) {
        String cantante, discoMasVendido;
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-----------------INGRESE CANTANTE Y NOMBRE DE DISCO MÁS VENDIDO-----------------------");
        cantante = entrada.next();
        discoMasVendido = entrada.next();
        cf.add(new CantanteFamoso(cantante, discoMasVendido));
        System.out.println("-----------------SE HA AGREGADO EL CANTANTE---------------------");
    }

    public static boolean existeCantante(ArrayList<CantanteFamoso> cf, String cantante) {
        Iterator<CantanteFamoso> it = cf.iterator();
        while (it.hasNext()) {
            CantanteFamoso next = it.next();
            if (next.getNombre().equals(cantante)) {
                return true;
            }
        }
        return false;
    }

    public static void editarCantante(ArrayList<CantanteFamoso> cf, String cantante) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        if (existeCantante(cf, cantante)) {
            System.out.println("Ingrese el nuevo nombre del cantante:");
            String nuevocantante = entrada.next();
            System.out.println("Ingrese el disco más vendido:");
            String nuevodisco = entrada.next();
            for (int i = 0; i < cf.size(); i++) {
                if (cf.get(i).getNombre().equals(cantante)) {
                    CantanteFamoso aux = cf.get(i);
                    aux.setNombre(nuevocantante);
                    aux.setDiscoConMasVentas(nuevodisco);
                }
            }
            System.out.println("-------------------SE HA EDITADO EL CANTANTE-----------------------------");
        } else {
            System.out.println("El cantante ingresado no existe!!");
        }
    }

    public static void eliminarCantante(ArrayList<CantanteFamoso> cf, String cantante) {
        if (existeCantante(cf, cantante)) {
            Iterator<CantanteFamoso> it = cf.iterator();
            String nuevocantante, nuevodisco;
            while (it.hasNext()) {
                CantanteFamoso next = it.next();
                if (next.getNombre().equals(cantante)) {
                    it.remove();
                }
            }
            System.out.println("Se ha eliminado el cantante " + cantante);
        } else {
            System.out.println("El cantante ingresado no existe!!");
        }
    }

}
