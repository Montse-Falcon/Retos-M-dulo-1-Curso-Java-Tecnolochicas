public class Tema implements Comparable<Tema>{
    String Titulo;
    int prioridad;

    public Tema (String titulo, int prioridad) {
        this.Titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return Titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo (Tema otra) {
        return this.Titulo.compareToIgnoreCase(otra.Titulo);
    }

    @Override
    public String toString() {
        return  String.format(("Tema: " + Titulo + " | Prioridad: " + prioridad));
    }
}
