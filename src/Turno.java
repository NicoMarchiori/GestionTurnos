import java.time.*;
import java.time.format.*;

public class Turno {
    //atributos
    private final LocalDate FECHAACTUAL = LocalDate.now();
    LocalTime horaDesde;
    LocalTime horaHasta;
    int id;
    Estado estado;

     // Constructores


    public Turno() {
    }

    public Turno(LocalTime horaDesde, LocalTime horaHasta, int id) {
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.estado = new Creado(true);
        this.id = id;
    }

    // metodos


    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Boolean estoyDisponible(){
        return estado.getEstaCreado();
    }
    public void reservarTurno(Turno turnoSeleccionado){
        estado.reservarTurno(turnoSeleccionado);
    }

    @Override
    public String toString() {
        return "Turno " + id +
                " | FECHAACTUAL:" + FECHAACTUAL +
                " | horaDesde:" + horaDesde +
                " | horaHasta:" + horaHasta +
                " | estado: " + estado;
    }
}
