public class Libro {
    // Propiedades
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //Constructor por defecto
    public Libro() {
        this.titulo = "Título por defecto";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    //Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    //Metodos para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    //ToString para mostrar los datos del libro
    @Override
    public String toString() {
        return "Libro{" +
                "título='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", número de páginas=" + numeroPaginas +
                '}';
    }
}
