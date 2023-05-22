/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.colas.y.pilas;

/**
 *
 * @author PC
 */
class Nodo {
    private char dato;
    private Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
        siguiente = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}