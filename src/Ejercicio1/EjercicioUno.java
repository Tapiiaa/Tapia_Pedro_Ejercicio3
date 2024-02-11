package Ejercicio1;
import java.util.Scanner;

public class EjercicioUno {
    public static String analizarSentimiento(String texto) {
        double sentimiento = 0;
        double umbralPositivo = 0.5;
        double umbralNegativo = -0.5;
        if(sentimiento > umbralPositivo) {
            return "Positivo";
        } else if(sentimiento < umbralNegativo) {
            return "Negativo";
        } else {
            return "Neutral";
        }
    }

}
