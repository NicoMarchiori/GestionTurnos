import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ControladorGeneradorTurno {
    // Constantes
    final int DIAS = 6;
    final int CANTTURNOS = 8;
    final LocalDate FECHA = LocalDate.now();

    //Atributos
    int dias;
    LocalDate fecha;
    LocalTime horaDesde;
    int cantTurnos;
    GeneradorTurnos generadorTurnos;
    DateTimeFormatter formatter;

    //Constructores

    public ControladorGeneradorTurno(GeneradorTurnos generadorTurnos, DateTimeFormatter formatter) {
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

    /**
     * Genera Turnos de forma manual solicitando cantidad de dias que se van a generar, fecha en la
     * que se van a generar turnos, hora de comienzo de los turnos en la mañana y en la tarde,
     * y la cantidad de turnos que se van a generar para la mañana y para la tarde
     * @param pantalla pantalla de generacion de turnos
     */
    public void generarTurnosManual(PantallaGeneracionTurnos pantalla){
        restarValues();
        solicitarDias(pantalla);
        for(int i = 0;i < getDias(); i++){
            setFecha(pantalla.solicitarFecha());
            for(int j = 0; j < 2; j++){
                if (j == 0){
                    System.out.println("Ingrese a partir de que hs comienzan los turnos por la mañana: ");
                    solicitarInformacion(pantalla);
                } else {
                    System.out.println("Ingrese a partir de que hs comienzan los turnos por la tarde: ");
                    solicitarInformacion(pantalla);
                }
            }
        }
        restarValues();
    }

    /**
     * Genera turnos de forma automatica para una cierta cantidad de dias,
     * ademas solicita la fecha a partir de la cual se empiezan a generar turnos.
     * por defecto se generan a partir de la fecha actual y se generan 8 turnos ya
     * sea a la mañana o a la tarde.
     * @param pantalla pantalla de generacion de turnos.
     */
    public void generarTurnosAutomaticamente(PantallaGeneracionTurnos pantalla){
        restarValues();
        solicitarDias(pantalla);
        System.out.println("La fecha a ingresar es a partir de que dia quiere empezar a generar la cantidad de turnos");
        setFecha(pantalla.solicitarFecha());
        for(int i = 0; i < getDias(); i++){
            for (int j = 0;j < 2;j++){
                if (j == 0){
                    generadorTurnos.generarTurnos(getFecha(), LocalTime.of(9,0), getCantTurnos(),formatter);
                } else {
                    generadorTurnos.generarTurnos(getFecha(), LocalTime.of(16,0), getCantTurnos(),formatter);
                }
            }
            setFecha(getFecha().plusDays(1));
        }
        restarValues();
    }

    public void solicitarDias(PantallaGeneracionTurnos pantalla){
        int cantDias = pantalla.solicitarDiasAGenerar();
        if (cantDias == 0) {
            System.out.println("Por defecto serán " + getDias() + " dias a generar.");
        }else{
            setDias(cantDias);
        }
    }

    public void solicitarInformacion(PantallaGeneracionTurnos pantalla){
        setHoraDesde(pantalla.solicitarHoraDesde());
        setCantTurnos(pantalla.cantidadTurnos());
        generadorTurnos.generarTurnos(getFecha(), getHoraDesde(), getCantTurnos(), formatter);
    }

    public void restarValues(){
        setFecha(FECHA);
        setCantTurnos(CANTTURNOS);
        setDias(DIAS);
    }
}
