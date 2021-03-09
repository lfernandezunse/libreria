/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Lucas
 */
public class Coloreo {
    private int dificultad;

    public Coloreo() {
        this.dificultad = 0;
    }
    
    public Coloreo(int dificultad) {
        this.dificultad = dificultad;
    }      

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}
