/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


/**
 *
 * @author LFern
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        System.out.println("Ingrese una opción");
        int opc = User.intInput();
        switch (opc){
            case 1: {
                agregarLibro();            
                break;
            }
            case 2: {
                buscarLibro();
                break;
            }
            case 3: {
                eliminarLibro();
                break;
            }
            case 4: {
                verLibrosCuentos();
                break;
            }
            case 5: {
                verLibrosColoreo();
                break;
            }
        }
        
        
        
        
    }
    public static void menu(){
            System.out.println("Menú de sección infantil");
            System.out.println("-----Opciones-----");
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar Libro");
            System.out.println("2 - Buscar un Libro");
            System.out.println("3 - Eliminar un Libro");
            System.out.println("4 - Ver Libros de Cuentos");
            System.out.println("5 - Ver Libros de Coloreo");
            System.out.println("------------------");
        }
    
    public static void agregarLibro(){
        System.out.println("Se va a agregar un libro");
        opcionesLibros();
        int intOpc = User.intInput();
        while (intOpc != 0){
            switch (intOpc){
                case 1:{
                    agregarCuento();
                    break;
                }
                case 2:{
                    System.out.println("Se va a agregar un libro de coloreo");
                    break;
                }
                default:{
                    System.out.println("La opción elegida es incorrecta");
                    break;
                }
            } 
            System.out.println("¿Desea agregar otro libro? S/N");
            String textOpc = User.textInput();
            if (textOpc.equals("s")){                
                opcionesLibros();
                intOpc = User.intInput(); 
            }     
            else{
                intOpc = 0;
            }
            
        }
        System.out.println("Saliendo...");
        
    }
    
    public static void opcionesLibros(){
        System.out.println("¿Que tipo de libro desea agregar?");
        System.out.println("0 - Salir");
        System.out.println("1 - Libros de cuentos");
        System.out.println("2 - Libros de coloreo");
    }   
    
    public static void agregarCuento(){
        System.out.println("Se va a agregar un libro de cuentos");  
        System.out.println("-----------------------------------");
        System.out.println("Ingrese el nombre del libro");
        String nombreLibro = User.textInput();
        while (nombreLibro.equals("")){
            System.out.println("El libro debe tener un nombre");
            System.out.println("Ingrese el nombre del libro");
            nombreLibro = User.textInput();
            
        }
    }
     
    public static void buscarLibro(){
        System.out.println("Se va buscar un libro");
    }
    
    public static void eliminarLibro(){
        System.out.println("Se va a eliminar un libro");        
    }
    
    public static void verLibrosCuentos(){        
        System.out.println("Se muestran todos los libros de cuentos");
    }
    
    public static void verLibrosColoreo(){
        System.out.println("Se muestran todos los libros de coloreo");
    }
}
