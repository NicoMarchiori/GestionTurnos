import java.util.ArrayList;

public class ControladorReservaTurno {
    // Atributos
    Turno turnoSeleccionado;
    PantallaReservaTurno pantalla;

    // Constructor

    public ControladorReservaTurno(PantallaReservaTurno pantalla) {
        this.pantalla = pantalla;
    }

    // metodos


    public Turno getTurnoSeleccionado() {
        return turnoSeleccionado;
    }

    public void setTurnoSeleccionado(Turno turnoSeleccionado) {
        this.turnoSeleccionado = turnoSeleccionado;
    }

    public void nuevaReservaTurno(GeneradorTurnos generadorTurnos){
        obtenerTurnosCreados(generadorTurnos.arrayTurnos);
        setTurnoSeleccionado(generadorTurnos.arrayTurnos.get(pantalla.seleccionarTurno(generadorTurnos.getArrayTurnos()) - 1));
        turnoSeleccionado.reservarTurno(turnoSeleccionado);
        obtenerTurnosCreados(generadorTurnos.arrayTurnos);
        pantalla.mostrarTurno(turnoSeleccionado);
    }

    public void obtenerTurnosCreados(ArrayList<Turno> arrayTurnos){
        for(Turno turno : arrayTurnos){
            if(turno.estoyDisponible()){
                pantalla.mostrarTurno(turno);
            }
        }
    }
}
