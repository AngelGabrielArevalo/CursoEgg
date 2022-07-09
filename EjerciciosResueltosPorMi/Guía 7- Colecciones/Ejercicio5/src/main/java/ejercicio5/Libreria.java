package ejercicio5;

 /*@author Angel Gabriel Arévalo*/ 

import ejercicio5.entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        HashSet<Libro> libros=new HashSet<Libro>();
        libros.add(new Libro("Programacion", "Egg", 10, 0));
        libros.add(new Libro("Matemática", "Egg", 10, 3));
        libros.add(new Libro("Filosofia", "Egg", 10, 10));
        libros.add(new Libro("Cocina", "Yoo", 110, 40));
        libros.add(new Libro("Cocina", "Yoo", 110, 40));
        mostrarLibros(libros);
        Iterator<Libro> it=libros.iterator();
        while (it.hasNext()) {
            Libro next = it.next();
//            if(next.prestamo()){
//                System.out.println("Prestamo exitoso");
//            }else{
//                System.out.println("No posee ejemplares disponibles");
//            }
            if(next.devolucion()){
                System.out.println("Devolución exitosa!!!");
            }else{
                System.out.println("No tiene libros prestados!!!!!!!!!");
            }
        }
    }

    public static void mostrarLibros(HashSet<Libro> libros){
        System.out.println("--------------------Libros--------------------");
        libros.forEach(x->System.out.println(x.toString()));
        System.out.println("------------------------------------------------");
    }
}
