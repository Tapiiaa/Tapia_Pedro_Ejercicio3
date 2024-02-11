package Ejercicio3;
    import java.util.ArrayList;
    import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroDeNodos = 10;
        List<nodo> nodos = new ArrayList<>();
        for(int i=1; i<=numeroDeNodos; i++){
            nodos.add(new nodo(i,0.0));
        }
        double canonTrafico = 0.5;
        simulacion.simularRed(nodos, canonTrafico);

    }

}
