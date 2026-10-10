/**
 * Nodo de la lista ligada: guarda un Videojuego y la referencia al siguiente nodo.
 */
public class Nodo {
    private Videojuego dato;
    private Nodo siguiente;

    public Nodo(Videojuego dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Videojuego getDato() { return dato; }
    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
