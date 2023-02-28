import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PantallaGeneracionTurnos {
        //Atributos
        Scanner sc;
        //Constructor

    public PantallaGeneracionTurnos(Scanner sc) {
        this.sc = sc;
    }

    //Metodos
    public int solicitarDiasAGenerar(){
        System.out.println("Ingrese para cuantos dias quiere generar turnos, > 0 y < 30, si ingresa 0 por defecto serán 6 días.");
        int dias = sc.nextInt();
        while (dias < 0 || dias > 30){
            System.out.println("Debe ingresar un valor > 0 y < 30, si ingresa 0 por defecto serán 6 días.");
            dias = sc.nextInt();
        }
        return dias;
    }
    public LocalDate solicitarFecha(){
        System.out.println("Ingrese la fecha formato dd/MM/yyyy :");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(sc.next(),formatter);
    }

    public LocalTime solicitarHoraDesde(){
        System.out.println("Ingrese primero la hora y luego los minutos ");
        return LocalTime.of(sc.nextInt(), sc.nextInt());
    }

    public int cantidadTurnos(){
        System.out.println("Ingrese la cantidad de turnos que quiere generar: ");
        return sc.nextInt();
    }
}
