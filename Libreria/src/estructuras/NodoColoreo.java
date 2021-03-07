/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import datos.Coloreo;
import datos.Libro;

/**
 *
 * @author LFern
 */
public class NodoColoreo extends Libro {
    private Coloreo info;
    private NodoColoreo ps;
    
    public NodoColoreo(Coloreo dato){
        this.info = dato;
        this.ps = null;
    }
    
    public Coloreo getDato() {
        return info;
    }

    public void setDato(Coloreo dato) {
        this.info = dato;
    }

    public NodoColoreo getPs() {
        return ps;
    }

    public void setPs(NodoColoreo ps) {
        this.ps = ps;
    }
}
