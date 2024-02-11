package Ejercicio2;

public class Valoraciones {
    private User user;
    private Libro libro;
    private int puntuación;

    public Valoraciones(User user, Libro libro, int puntuación){
        this.user=user;
        this.libro=libro;
        this.puntuación=puntuación;
    }
    public User getUser(){
        return this.user;
    }
    public Libro getLibro(){
        return this.libro;
    }
    public int getPuntuación(){
        return this.puntuación;
    }
}
