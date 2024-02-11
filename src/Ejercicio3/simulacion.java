package Ejercicio3;
import java.util.Random;
import java.util.List;
public class simulacion {
    public static void simularTrafico(nodo nodo, double canonTrafico){
        Random rndm= new Random();
        double traficoGeneral = rndm.nextDouble();
        nodo.trafico=traficoGeneral;
    }
    public static void simularRed(List<nodo> nodos, double canonTrafico){
        for(nodo nodo: nodos){
            simularTrafico(nodo, canonTrafico);
        }
    }
}
