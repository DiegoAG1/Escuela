/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Fenix
 */
public class NodoArbol {
    int dato;
    String verdura;
    NodoArbol hijoIzquierdo, hijoDerecho;
    public NodoArbol(int d, String verd){
        this.dato=d;
        this.verdura=verd;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return verdura + " Su dato es " + dato;
    }
}