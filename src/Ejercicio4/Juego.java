package Ejercicio4;
import java.util.List;
import java.util.Scanner;
public class Juego {
    public static void jugarNivel(Nivel nivel){
        for(String desafio : nivel.getDesafios()){
            System.out.println("Desafio: " + desafio);
        }
    }
    private static String solveChallenge(String challenge){
        System.out.println("Ejercicio 1, imprime hola, me llamo (Tu nombre)");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ejercicio 2: Declarar un numero de tipo entero entre 1 y 10");
        int numero1 = scanner.nextInt();
        if(numero1 < 1 || numero1 > 10){
            return "Numero invalido";
        }

        return "Hecho";
    }
    public static void main(String[] args) {
        List<String> desafios = List.of("Ejercicio 1", "Ejercicio 2");
        Nivel nivel = new Nivel(1, desafios);
        jugarNivel(nivel);
        for(String desafio : nivel.getDesafios()){
            System.out.println(solveChallenge(desafio));
        }
    }
}
