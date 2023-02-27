import java.util.InputMismatchException;
import java.util.Scanner;

public class PantallaPrincipal {
    //Atributos
    Scanner sc;
    boolean salir = false;
    int opcion;
    ControladorReservaTurno ctrlReservaTurno;
    GeneradorTurnos generadorTurnos;





    // Constructor

    public PantallaPrincipal(Scanner sc,GeneradorTurnos generadorTurnos, ControladorReservaTurno ctrlReservaTurno) {
        this.generadorTurnos = generadorTurnos;
        this.ctrlReservaTurno = ctrlReservaTurno;
        this.sc = sc;
    }


    //Metodos


    public ControladorReservaTurno getCtrlReservaTurno() {
        return ctrlReservaTurno;
    }

    public void setCtrlReservaTurno(ControladorReservaTurno ctrlReservaTurno) {
        this.ctrlReservaTurno = ctrlReservaTurno;
    }

    public GeneradorTurnos getGeneradorTurnos() {
        return generadorTurnos;
    }

    public void setGeneradorTurnos(GeneradorTurnos generadorTurnos) {
        this.generadorTurnos = generadorTurnos;
    }

    public void mostrarMenu(){
        while(!salir) {

            System.out.println("1. Reservar Turno");
            System.out.println("2. Confirmar Turno");
            System.out.println("3. Cancelar Turno");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion reservar Turno");
                        ctrlReservaTurno.nuevaReservaTurno(generadorTurnos);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
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
