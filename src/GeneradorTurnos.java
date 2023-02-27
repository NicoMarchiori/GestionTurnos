import java.time.LocalTime;
import java.util.ArrayList;

public class GeneradorTurnos {
    // Atributos
    int id = 1;
    LocalTime hora = LocalTime.of(16,0);
    ArrayList<Turno> arrayTurnos = new ArrayList<>();

    // constructor

    public GeneradorTurnos() {
    }


    // Metodos

    public void generarTurnos(){
        /*String[] vectorTurnos = {"t1", "t2", "t3", "t4", "t5",
                "t6", "t7", "t8", "t9", "t10",};
        System.out.println("Generando Turnos....");
        for(String t: vectorTurnos){
            this.arrayTurnos.add(new Turno(hora , hora.plusMinutes(30)));
            hora.plusMinutes(30);
        }
        System.out.println("turnos Generados!!");*/

        System.out.println("Generando Turnos....");
        Turno t1 = new Turno(hora , hora.plusMinutes(30), id++);
        this.arrayTurnos.add(t1);
        Turno t2 = new Turno(hora.plusMinutes(30), hora.plusMinutes(60), id++);
        this.arrayTurnos.add(t2);
        Turno t3 = new Turno(hora.plusMinutes(60), hora.plusMinutes(90), id++);
        this.arrayTurnos.add(t3);
        Turno t4 = new Turno(hora.plusMinutes(90), hora.plusMinutes(120), id++);
        this.arrayTurnos.add(t4);
        Turno t5 = new Turno(hora.plusMinutes(120), hora.plusMinutes(150), id++);
        this.arrayTurnos.add(t5);
        Turno t6 = new Turno(hora.plusMinutes(150), hora.plusMinutes(180), id++);
        this.arrayTurnos.add(t6);
        Turno t7 = new Turno(hora.plusMinutes(180), hora.plusMinutes(210), id++);
        this.arrayTurnos.add(t7);
        Turno t8 = new Turno(hora.plusMinutes(210), hora.plusMinutes(240), id++);
        this.arrayTurnos.add(t8);
        Turno t9 = new Turno(hora.plusMinutes(240), hora.plusMinutes(270), id++);
        this.arrayTurnos.add(t9);
        Turno t10 = new Turno(hora.plusMinutes(270), hora.plusMinutes(300), id++);
        this.arrayTurnos.add(t10);
        System.out.println("turnos Generados!!");
    }

    public void MostrarTurnos(){
        for (Object t : this.arrayTurnos){
            System.out.println(t);
        }
    }
}
