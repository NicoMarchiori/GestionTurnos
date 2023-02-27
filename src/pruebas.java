import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Esto se ejecuta en segundo plano una única vez
                while (true) {
                    // Pero usamos un truco y hacemos un ciclo infinito
                    try {
                        // En él, hacemos que el hilo duerma
                        Thread.sleep(30);
                        // Y después realizamos las operaciones
                        System.out.println("Me imprimo cada segundo");
                        // Así, se da la impresión de que se ejecuta cada cierto tiempo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // Creamos un hilo y le pasamos el runnable
        Thread hilo = new Thread(runnable);
        hilo.start();

        // Y aquí podemos hacer cualquier cosa, en el hilo principal del programa
        System.out.println("Yo imprimo en el hilo principal");

    }
}
