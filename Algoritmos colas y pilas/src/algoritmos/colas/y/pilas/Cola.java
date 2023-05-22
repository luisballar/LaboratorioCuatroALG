package algoritmos.colas.y.pilas;
public class Cola {
    private Nodo Top;
    private Nodo Base;

    public Cola() {
        Top = null;
        Base = null;
    }

    public boolean empty() {
        return Top == null;
    }

    public void enqueue(char c) {
        Nodo nuevoNodo = new Nodo(c);

        if (empty()) {
            Top = nuevoNodo;
            Base = nuevoNodo;
        } else {
            Base.setSiguiente(nuevoNodo);
            Base = nuevoNodo;
        }               
    }

    public char dequeue() {

        if (empty()) {
            System.out.println("La cola está vacía. No se puede eliminar ningún elemento.");
            return '\0';
        }
        
        char removedElement = Top.getDato();
        Top = Top.getSiguiente();
        
        if (Top == null) {
            Base = null;
        }        
        System.out.println("Se sacó el elemento " + removedElement);
        return removedElement;
    }


}

