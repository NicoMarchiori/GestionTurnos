import java.sql.SQLOutput;
import java.util.ArrayList;

public class ControladorReservaTurno {
    // Atributos
    Turno turnoSeleccionado;

    // Constructor

    public ControladorReservaTurno() {
    }

    // metodos


    public Turno getTurnoSeleccionado() {
        return turnoSeleccionado;
    }

    public void setTurnoSeleccionado(Turno turnoSeleccionado) {
        this.turnoSeleccionado = turnoSeleccionado;
    }

    public void nuevaReservaTurno(GeneradorTurnos generadorTurnos, PantallaReservaTurno pantalla){
        if (esArrayNulo(generadorTurnos.arrayTurnos)){
            System.out.println("No hay turnos para reservar.");
        }else {
            obtenerTurnosCreados(generadorTurnos.arrayTurnos, pantalla);
            System.out.println("\nSeleccione un turno: ");
            setTurnoSeleccionado(generadorTurnos.arrayTurnos.get(pantalla.seleccionarTurno(generadorTurnos.getArrayTurnos()) - 1));
            turnoSeleccionado.reservarTurno(turnoSeleccionado);
            System.out.println("\nTurno Reservado:");
            pantalla.mostrarTurno(turnoSeleccionado);
            System.out.println();
        }
    }

    public void obtenerTurnosCreados(ArrayList<Turno> arrayTurnos, PantallaReservaTurno pantalla){
        for(Turno turno : arrayTurnos){
            if(turno.estoyDisponible()){
                pantalla.mostrarTurno(turno);
            }
        }
    }

    public Boolean esArrayNulo(ArrayList<Turno> array){
        return array.size() == 0;
    }
}
