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
public class Libro {
    private static int ID = 0;
    private String titulo;
    private String editorial;
    private float precio;
    private int edad; //Esta es la edad a partir de la cual se recomienda leer este libro
    private int stock;

    
    public Libro(){
        this.titulo = null;
        this.editorial = null;
        this.precio = 0;
        this.edad = 0;
        this.stock = 0;
    }
    public Libro(String titulo, String editorial, float precio, int edad, int stock) {
        this.ID++;
        this.titulo = titulo;
        this.editorial = editorial;
        this.precio = precio;
        this.edad = edad;
        this.stock = stock;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
