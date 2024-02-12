package Ejercicio4;
import java.util.List;
public class Nivel {
    private int dificultad;
    private List<String> desafios;
    public Nivel(int dificultad, List<String> desafios){
        this.dificultad = dificultad;
        this.desafios = desafios;
    }
    public int getDificultad(){
        return dificultad;
    }
    public List<String> getDesafios(){
        return desafios;
    }

}
