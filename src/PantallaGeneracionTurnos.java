import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PantallaGeneracionTurnos {
    //Atributos
    int opcion;
    Scanner sc;
    //Constructor

    public PantallaGeneracionTurnos(Scanner sc) {
        this.sc = sc;
    }

    //Metodos
    public int solicitarDiasAGenerar() {
        System.out.println("Ingrese para cuantos dias quiere generar turnos, > 0 y < 30, si ingresa 0 por defecto serán 6 días.");
        int dias = sc.nextInt();
        while (dias < 0 || dias > 30) {
            System.out.println("Debe ingresar un valor > 0 y < 30, si ingresa 0 por defecto serán 6 días.");
            dias = sc.nextInt();
        }
        return dias;
    }

    public LocalDate solicitarFecha() {
        System.out.println("Ingrese la fecha formato dd/mm/yyyy :");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(sc.next(), formatter);
    }

    public LocalTime solicitarHoraDesde() {
        System.out.println("Ingrese primero la hora y luego los minutos ");
        return LocalTime.of(sc.nextInt(), sc.nextInt());
    }

    public int cantidadTurnos() {
        System.out.println("Ingrese la cantidad de turnos que quiere generar: ");
        return sc.nextInt();
    }

    public void mostrarMenu(ControladorGeneradorTurno ctrlGeneradorTurno, PantallaGeneracionTurnos pantalla) {
        boolean salir = false;


        while (!salir) {

            System.out.println("1. Generar turno manualmente");
            System.out.println("2. Generar turno automaticamente");
            System.out.println("3. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        ctrlGeneradorTurno.generarTurnosManual(pantalla);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        ctrlGeneradorTurno.generarTurnosAutomaticamente(pantalla);
                        break;
                    case 3:
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
