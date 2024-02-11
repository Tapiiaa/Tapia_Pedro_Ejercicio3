package Ejercicio2;
import java.util.ArrayList;
import java.util.List;


public class EjercicioDos {
    private List<Libro> getlibrosInteresantes(User user) {
        return new ArrayList<>();
    }
    private List<Libro> getValoraciones(User user) {
        return new ArrayList<>();
    }


    public List<Libro> libroRecomendado(User user) {
        List<Libro> librosInteresantes = getlibrosInteresantes(user);
        List<Libro> valoraciones = getValoraciones(user);
        List<Libro> recomendaciones = new ArrayList<>();
        for (Libro libro : librosInteresantes) {
if (!valoraciones.contains(libro)) {
                recomendaciones.add(libro);
            }
        }

        return recomendaciones;
    }
}
