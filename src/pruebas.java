import java.time.*;
public class pruebas {
    public static void main(String[] args) {
        LocalTime Hora1 = LocalTime.of(16,0);
        LocalTime Hora2 = LocalTime.of(0,30);
        System.out.println("Hora Final" + Hora1.plusMinutes(90));
    }
}
