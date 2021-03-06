package estructuras;

import datos.Cuento;

public class NodoCuento {

    private Cuento info;
    private NodoCuento pd;
    private NodoCuento pi;

    public NodoCuento() {
        this.pd = null;
        this.pi = null;
    }

    public NodoCuento(Cuento dato) {
        this.info = null;
        this.pd = null;
        this.pi = null;
    }

    public Cuento getDato() {
        return this.info;
    }

    public void setDato(Cuento dato) {
        this.info = dato;
    }

    public NodoCuento getPd() {
        return pd;
    }

    public void setPd(NodoCuento pd) {
        this.pd = pd;
    }

    public NodoCuento getPi() {
        return pi;
    }

    public void setPi(NodoCuento pi) {
        this.pi = pi;
    }
}
