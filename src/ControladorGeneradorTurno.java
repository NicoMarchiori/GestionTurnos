import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ControladorGeneradorTurno {
    //Atributos
    int dias = 6;
    LocalDate fecha;
    LocalTime horaDesde;
    int cantTurnos;
    GeneradorTurnos generadorTurnos;
    PantallaGeneracionTurnos pantalla;
    DateTimeFormatter formatter;

    //Constructores

    public ControladorGeneradorTurno(PantallaGeneracionTurnos pantalla, GeneradorTurnos generadorTurnos, DateTimeFormatter formatter) {
        this.pantalla = pantalla;
        this.generadorTurnos = generadorTurnos;
        this.formatter = formatter;
    }


    //Metodos


    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public int getCantTurnos() {
        return cantTurnos;
    }

    public void setCantTurnos(int cantTurnos) {
        this.cantTurnos = cantTurnos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void generarTurnos(){
        int cantDias = pantalla.solicitarDiasAGenerar();
        if (cantDias == 0) {
            System.out.println("Por defecto serán 6 dias a generar.");
        }else{
            setDias(cantDias);
        }
        for(int i = 0;i < getDias(); i++){
            setFecha(pantalla.solicitarFecha());
            for(int j = 0; j < 2; j++){
                if (j == 0){
                    System.out.println("Ingrese a partir de que hs comienzan los turnos por la mañana: ");
                    solicitarInformacion();
                } else {
                    System.out.println("Ingrese a partir de que hs comienzan los turnos por la tarde: ");
                    solicitarInformacion();
                }
            }
        }
    }

    public void solicitarInformacion(){
        setHoraDesde(pantalla.solicitarHoraDesde());
        setCantTurnos(pantalla.cantidadTurnos());
        generadorTurnos.generarTurnos(getFecha(), getHoraDesde(), getCantTurnos(), formatter);
    }

}
