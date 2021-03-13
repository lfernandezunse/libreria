/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import datos.Coloreo;
/**
 *
 * @author LFern
 */
public class Lista {
    private NodoColoreo list;
    
    public Lista(){
        this.list = null;
    }
    
    public NodoColoreo inicio(){
        return this.list;
    }
    
    public boolean listaVacia(){
        return (this.list == null);
    }
    
    public void insertarPri(Coloreo elem){
        NodoColoreo x = new NodoColoreo(elem);
        if (this.list == null){
            this.list = x;
        }else{
            x.setPs(this.list);
            this.list = x;
        }
    }
    
    public NodoColoreo quitar(NodoColoreo p, NodoColoreo ant){
        NodoColoreo x = p;
        
        if (p == this.list){
            this.list = p.getPs();
        } else {
            ant.setPs(p.getPs());
        }
        
        return x;
    }
    
    public NodoColoreo eliminar(int codigo){
        NodoColoreo x = null;
        NodoColoreo p = this.list;
        NodoColoreo ant = null;
        if (list == null){
            return x;
        }
        boolean flag = false;
        while (p != null && !flag){
            if (p.getDato().getID() == codigo){
                flag = true;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        
        if (flag==true){
            quitar(p, ant);
            x = p;
        }
        return x;
    }
    
}
