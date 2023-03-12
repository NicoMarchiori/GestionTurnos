import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Atributos
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        GeneradorTurnos generadorTurnos = new GeneradorTurnos();
        PantallaGeneracionTurnos pantallaGeneracionTurnos = new PantallaGeneracionTurnos(sc);
        ControladorGeneradorTurno ctrlGeneradorTurno = new ControladorGeneradorTurno(generadorTurnos, formatter);
        PantallaReservaTurno pantallaReservaTurno = new PantallaReservaTurno(sc);
        ControladorReservaTurno ctrlReservaTurno = new ControladorReservaTurno();
        boolean salir = false;
        int opcion;

        while(!salir) {

            System.out.println("1. Reservar Turno");
            System.out.println("2. Confirmar Turno");
            System.out.println("3. Cancelar Turno");
            System.out.println("4. Generar Turno"); //SOLO PARA ADMINISTRADORES
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion reservar Turno");
                        ctrlReservaTurno.nuevaReservaTurno(generadorTurnos, pantallaReservaTurno);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        pantallaGeneracionTurnos.mostrarMenu(ctrlGeneradorTurno, pantallaGeneracionTurnos);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
    }
}
