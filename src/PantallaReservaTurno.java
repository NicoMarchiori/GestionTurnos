import java.util.Scanner;

public class PantallaReservaTurno {
    //Atributos
    Scanner sc;
    // Constructor

    public PantallaReservaTurno(Scanner sc) {
        this.sc = sc;
    }


    //Metodos

    public void mostrarTurno(Turno turno){
        System.out.println(turno);
    }

    public int seleccionarTurno(){
        System.out.println("Seleccione un turno");
        return sc.nextInt();
    }
}
