import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeneradorTurnos generadorTurnos = new GeneradorTurnos();
        generadorTurnos.generarTurnos();
        ControladorReservaTurno ctrlReservaTurno = new ControladorReservaTurno(new PantallaReservaTurno(sc));
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(sc, generadorTurnos, ctrlReservaTurno);
        pantallaPrincipal.mostrarMenu();
    }
}
