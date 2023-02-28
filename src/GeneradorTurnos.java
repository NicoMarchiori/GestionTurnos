import java.time.*;
import java.util.ArrayList;
import java.time.format.*;

public class GeneradorTurnos {
    // Atributos
    LocalTime hora;
    ArrayList<Turno> arrayTurnos = new ArrayList<>();
    int id = 1;

    // constructor

    public GeneradorTurnos(){}

    // Metodos


    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public ArrayList<Turno> getArrayTurnos() {
        return arrayTurnos;
    }

    public void setArrayTurnos(ArrayList<Turno> arrayTurnos) {
        this.arrayTurnos = arrayTurnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void generarTurnos(LocalDate fecha, LocalTime hora, int cantidadTurnos, DateTimeFormatter formatter){
        setHora(hora);
        System.out.println("Generando Turnos....");
        for(int i = 0; i < cantidadTurnos ;i++){
            Turno turno = new Turno(fecha, getHora() , getHora().plusMinutes(30), id++, formatter);
            setHora(getHora().plusMinutes(30));
            arrayTurnos.add(turno);
        }
        System.out.println("turnos Generados!!\n");
    }

    // Validadores
}
