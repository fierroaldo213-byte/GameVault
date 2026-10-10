/**
 * Lista ligada simple implementada desde cero para almacenar Videojuegos.
 */
public class ListaLigada {
    private Nodo cabeza;
    private int tamanio;

    public ListaLigada() {
        cabeza = null;
        tamanio = 0;
    }

    public boolean estaVacia() { return cabeza == null; }
    public int getTamanio() { return tamanio; }

    /** Agrega un videojuego al final de la lista. */
    public void agregarAlFinal(Videojuego juego) {
        Nodo nuevo = new Nodo(juego);
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++;
    }

    /** Agrega un videojuego al inicio de la lista. */
    public void agregarAlInicio(Videojuego juego) {
        Nodo nuevo = new Nodo(juego);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
        tamanio++;
    }

    /** Elimina el primer videojuego con ese título. Devuelve true si lo eliminó. */
    public boolean eliminar(String titulo) {
        if (estaVacia()) return false;

        if (cabeza.getDato().getTitulo().equalsIgnoreCase(titulo)) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().getTitulo().equalsIgnoreCase(titulo)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamanio--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /** Busca un videojuego por título. Devuelve null si no existe. */
    public Videojuego buscar(String titulo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getTitulo().equalsIgnoreCase(titulo)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    /** Imprime todos los videojuegos de la lista. */
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La colección está vacía.");
            return;
        }
        Nodo actual = cabeza;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". " + actual.getDato());
            actual = actual.getSiguiente();
            i++;
        }
    }

    // ---------- Estadísticas (operación extra) ----------

    public double totalHoras() {
        double total = 0;
        for (Nodo n = cabeza; n != null; n = n.getSiguiente()) {
            total += n.getDato().getHorasJugadas();
        }
        return total;
    }

    public double promedioCalificacion() {
        if (estaVacia()) return 0;
        double suma = 0;
        for (Nodo n = cabeza; n != null; n = n.getSiguiente()) {
            suma += n.getDato().getCalificacion();
        }
        return suma / tamanio;
    }

    public int contarCompletados() {
        int c = 0;
        for (Nodo n = cabeza; n != null; n = n.getSiguiente()) {
            if (n.getDato().isCompletado()) c++;
        }
        return c;
    }
}
