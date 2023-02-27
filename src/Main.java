import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GeneradorTurnos CTurnos = new GeneradorTurnos();

        CTurnos.generarTurnos();

        ControladorReservaTurno CRTurno = new ControladorReservaTurno(new PantallaReservaTurno(sc));
        CRTurno.nuevaReservaTurno(CTurnos);
    }
}
