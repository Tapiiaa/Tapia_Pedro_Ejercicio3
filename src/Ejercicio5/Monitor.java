package Ejercicio5;

public class Monitor {
    public static Rendimiento medirRendimiento(App app) {
        //Pseudocódigo: Aqui,, obtendriamos y mediriamos los datos de rendimiento.
        double CPU = Math.random() * 100;
        double memoria = Math.random() * 1024;
        return new Rendimiento((int) CPU, (int) memoria);
    }
}
