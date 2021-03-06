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
public class Cuento extends Libro{
    private int tipo;
    private String autor;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public boolean existe(){
        int id = getID();
        if (id == 0){
            return false;
        }
        return true;
    }
    
    public void mostrarInfo(){
        int id = getID();
        int edad = getEdad();
        String titulo = getTitulo();
        float precio = getPrecio();
        int stock = getStock();
    }
}
