/**
 * Representa un videojuego de la colección del usuario.
 */
public class Videojuego {
    private String titulo;
    private String plataforma;
    private String genero;
    private double horasJugadas;
    private double calificacion; // 0 a 10
    private boolean completado;

    public Videojuego(String titulo, String plataforma, String genero,
                      double horasJugadas, double calificacion, boolean completado) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
        this.calificacion = calificacion;
        this.completado = completado;
    }

    public String getTitulo() { return titulo; }
    public String getPlataforma() { return plataforma; }
    public String getGenero() { return genero; }
    public double getHorasJugadas() { return horasJugadas; }
    public double getCalificacion() { return calificacion; }
    public boolean isCompletado() { return completado; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setHorasJugadas(double horasJugadas) { this.horasJugadas = horasJugadas; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
    public void setCompletado(boolean completado) { this.completado = completado; }

    @Override
    public String toString() {
        return String.format("🎮 %s | %s | %s | %.1f hrs | ⭐ %.1f/10 | %s",
                titulo, plataforma, genero, horasJugadas, calificacion,
                completado ? "✅ Completado" : "⏳ En progreso");
    }
}
