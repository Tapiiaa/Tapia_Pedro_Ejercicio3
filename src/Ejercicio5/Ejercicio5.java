package Ejercicio5;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Ejercicio5 {

    public static void mostrarRendimiento(App app) {
        Rendimiento rendimiento = Monitor.medirRendimiento(app);
        System.out.println("La app " + app.getNombre() + " tiene un rendimiento de " + rendimiento.CPU + " en CPU y " + rendimiento.memoria + " en memoria.");
    }
    public static void main(String[] args) {
        App[]aplicaciones={
                new App("Aplicacion 1"),
                new App("Aplicacion 2"),
                new App("Aplicacion 3")
        };
        Monitor monitor = new Monitor();
        for(App app:aplicaciones){
            mostrarRendimiento(app);
        }
    }

}
