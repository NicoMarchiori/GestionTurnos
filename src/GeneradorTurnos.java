import java.time.LocalTime;
import java.util.ArrayList;

public class GeneradorTurnos {
    // Atributos
    LocalTime hora = LocalTime.of(16,0);
    ArrayList<Turno> arrayTurnos = new ArrayList<>();

    int id = 1;

    // constructor

    public GeneradorTurnos() {
    }

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

    public void generarTurnos(){
        System.out.println("Generando Turnos....");
        for(int i = 0; i < 10 ;i++){
            Turno turno = new Turno(hora , hora.plusMinutes(30), id++);
            setHora(hora.plusMinutes(30));
            arrayTurnos.add(turno);
        }
        System.out.println("turnos Generados!!");
    }

    public void MostrarTurnos(){
        for (Object t : this.arrayTurnos){
            System.out.println(t);
        }
    }
}
