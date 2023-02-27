public class Creado extends Estado{

    // Constructor

    public Creado(Boolean estaCreado) {
        setEstaCreado(estaCreado);
    }

    // metodos
    public void reservarTurno(Turno turnoSeleccionado){
        crearProximoEstado(turnoSeleccionado);
    }
    public void crearProximoEstado(Turno turnoSeleccionado){
        Estado reservado = new Reservado();
        turnoSeleccionado.setEstado(reservado);

    }

    @Override
    public String toString() {
        return "Disponible";
    }
}
