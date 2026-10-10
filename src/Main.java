import java.util.Scanner;

/**
 * GameVault - Administrador de colección de videojuegos (menú por consola).
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ListaLigada lista = new ListaLigada();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");
            System.out.println();
            switch (opcion) {
                case 1 -> agregar();
                case 2 -> eliminar();
                case 3 -> lista.mostrar();
                case 4 -> buscar();
                case 5 -> editar();
                case 6 -> estadisticas();
                case 0 -> System.out.println("¡Game over! Gracias por usar GameVault 👾");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== 🕹️  GAMEVAULT ===");
        System.out.println("1. Agregar videojuego");
        System.out.println("2. Eliminar videojuego");
        System.out.println("3. Mostrar colección");
        System.out.println("4. Buscar videojuego");
        System.out.println("5. Editar videojuego");
        System.out.println("6. Ver estadísticas");
        System.out.println("0. Salir");
    }

    private static void agregar() {
        System.out.print("Título: ");
        String titulo = sc.nextLine().trim();
        System.out.print("Plataforma (PC, PS5, Switch...): ");
        String plataforma = sc.nextLine().trim();
        System.out.print("Género: ");
        String genero = sc.nextLine().trim();
        double horas = leerDouble("Horas jugadas: ", 0, 100000);
        double calif = leerDouble("Calificación (0-10): ", 0, 10);
        boolean completado = leerSiNo("¿Lo completaste? (s/n): ");

        Videojuego juego = new Videojuego(titulo, plataforma, genero, horas, calif, completado);

        if (lista.estaVacia() || !leerSiNo("¿Agregar al inicio? (s = inicio, n = final): ")) {
            lista.agregarAlFinal(juego);
        } else {
            lista.agregarAlInicio(juego);
        }
        System.out.println("✅ Videojuego agregado.");
    }

    private static void eliminar() {
        System.out.print("Título a eliminar: ");
        String titulo = sc.nextLine().trim();
        if (lista.eliminar(titulo)) {
            System.out.println("🗑️ Eliminado correctamente.");
        } else {
            System.out.println("No se encontró ese videojuego.");
        }
    }

    private static void buscar() {
        System.out.print("Título a buscar: ");
        Videojuego j = lista.buscar(sc.nextLine().trim());
        System.out.println(j != null ? j : "No se encontró ese videojuego.");
    }

    private static void editar() {
        System.out.print("Título del juego a editar: ");
        Videojuego j = lista.buscar(sc.nextLine().trim());
        if (j == null) {
            System.out.println("No se encontró ese videojuego.");
            return;
        }
        System.out.println("Actual: " + j);
        System.out.println("¿Qué deseas editar?");
        System.out.println("1. Horas jugadas  2. Calificación  3. Estado de completado");
        int op = leerEntero("Opción: ");
        switch (op) {
            case 1 -> j.setHorasJugadas(leerDouble("Nuevas horas: ", 0, 100000));
            case 2 -> j.setCalificacion(leerDouble("Nueva calificación (0-10): ", 0, 10));
            case 3 -> j.setCompletado(leerSiNo("¿Completado? (s/n): "));
            default -> { System.out.println("Opción inválida."); return; }
        }
        System.out.println("✏️ Actualizado: " + j);
    }

    private static void estadisticas() {
        System.out.println("📊 ESTADÍSTICAS");
        System.out.println("Juegos en la colección: " + lista.getTamanio());
        System.out.printf("Horas totales jugadas: %.1f%n", lista.totalHoras());
        System.out.printf("Calificación promedio: %.2f/10%n", lista.promedioCalificacion());
        System.out.println("Juegos completados: " + lista.contarCompletados());
    }

    // ---------- Lectura segura de datos ----------

    private static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número entero válido.");
            }
        }
    }

    private static double leerDouble(String msg, double min, double max) {
        while (true) {
            System.out.print(msg);
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                if (v >= min && v <= max) return v;
                System.out.println("Debe estar entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número válido.");
            }
        }
    }

    private static boolean leerSiNo(String msg) {
        while (true) {
            System.out.print(msg);
            String r = sc.nextLine().trim().toLowerCase();
            if (r.equals("s")) return true;
            if (r.equals("n")) return false;
            System.out.println("Responde con 's' o 'n'.");
        }
    }
}
