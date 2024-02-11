package Ejercicio2;

public class Libro {
    private String titulo;
    private String autor;
    private String ID;

    public Libro(String Titulo, String autor, String ID) {
        this.titulo = titulo;
        this.autor = autor;
        this.ID = ID;
    }
    public String getID(){
        return this.ID;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }


}

