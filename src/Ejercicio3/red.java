package Ejercicio3;
import java.util.List;
import java.util.ArrayList;

public class red {
    List<nodo> nodos;
    public red(int numeroDeNodos){
        nodos = new ArrayList<>();
        for(int i=1; i<=numeroDeNodos; i++){
            nodos.add(new nodo(i,0.0));
        }
    }
}
