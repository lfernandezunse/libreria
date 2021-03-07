package estructuras;

import datos.Cuento;

public class ArbolBinario {

    private NodoCuento raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    public NodoCuento getRaiz() {
        return raiz;
    }

    public void insertar(Cuento dato) {
        if (arbolVacio()) {
            raiz = new NodoCuento(dato);
        } else {
            insertarR(raiz, dato);
        }
    }

    public void insertarR(NodoCuento p, Cuento dato) {
        if (dato.getID() > p.getDato().getID()) {
            if (p.getPd() == null) {
                p.setPd(new NodoCuento(dato));
            } else {
                insertarR(p.getPd(), dato);
            }
        } else if (p.getPi() == null) {
            p.setPi(new NodoCuento(dato));
        } else {
            insertarR(p.getPi(), dato);
        }
    }
    
    public void visualizar(){
         
    }

}
