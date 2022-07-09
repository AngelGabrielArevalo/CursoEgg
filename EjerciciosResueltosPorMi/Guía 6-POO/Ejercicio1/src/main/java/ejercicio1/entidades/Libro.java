package ejercicio1.entidades;

/*@author Angel Gabriel Arévalo*/
public class Libro {
    private String isbn, titulo, autor;
    private int num_pag;

    public Libro(String isbn, String titulo, String autor, int num_pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", num_pag=" + num_pag + '}';
    }
    
    public String mostrarInfo(){
        return "ISBN: "+isbn+". Título: "+titulo+". Autor: "+autor;
    }
}
