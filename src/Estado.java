abstract public class Estado {
    //Atributos
    Boolean estaCreado = false;
    Boolean estaReservado = false;
    Boolean estaCancelado = false;
    Boolean estaConfirmado = false;
    Boolean estaFinalizado = false;

    // Constructores

    public Estado() {
    }


    // Metodos


    public void setEstaCreado(Boolean estaCreado) {
        this.estaCreado = estaCreado;
    }

    public void setEstaReservado(Boolean estaReservado) {
        this.estaReservado = estaReservado;
    }

    public void setEstaCancelado(Boolean estaCancelado) {
        this.estaCancelado = estaCancelado;
    }

    public void setEstaConfirmado(Boolean estaConfirmado) {
        this.estaConfirmado = estaConfirmado;
    }

    public void setEstaFinalizado(Boolean estaFinalizado) {
        this.estaFinalizado = estaFinalizado;
    }

    public Boolean getEstaCreado() {
        return estaCreado;
    }

    public Boolean getEstaReservado() {
        return estaReservado;
    }

    public Boolean getEstaCancelado() {
        return estaCancelado;
    }

    public Boolean getEstaConfirmado() {
        return estaConfirmado;
    }

    public Boolean getEstaFinalizado() {
        return estaFinalizado;
    }


    public void reservarTurno(Turno turnoSeleccionado) {}

    private void crearProximoEstado() {
    }
}