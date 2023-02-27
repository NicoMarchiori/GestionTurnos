import java.util.ArrayList;
import java.util.Scanner;

public class PantallaReservaTurno {
    //Atributos
    Scanner sc;
    // Constructor

    public PantallaReservaTurno(Scanner sc) {
        this.sc = sc;
    }


    //Metodos

    public void mostrarTurno(Turno turno) {
        System.out.println(turno);
    }

    public int seleccionarTurno(ArrayList<Turno> arrayTurnos) {
        int valor = sc.nextInt();
        while ((valor > arrayTurnos.size()) || (valor < 0)) {
            System.out.println("El turno ingresado no existe...");
            valor = sc.nextInt();
        }
        return valor;
    }
}
