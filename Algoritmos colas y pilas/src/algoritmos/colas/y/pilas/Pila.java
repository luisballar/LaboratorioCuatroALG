/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.colas.y.pilas;
/**
 *
 * @author Jose
 */
public class Pila {
    private Nodo top;

    public Pila() {
        top = null;
    }

    public boolean empty() {
        return top == null;
    }


    public void push(char c) {
        Nodo nuevoNodo = new Nodo(c);
        nuevoNodo.setSiguiente(top);
        top = nuevoNodo;
    }

    public char pop() {
        if (empty()) {
            System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
            return '\0';
        }
        char removedElement = top.getDato();
        top = top.getSiguiente();
        System.out.println("Se sacó el elemento " + removedElement);
        return removedElement;
    }
}
