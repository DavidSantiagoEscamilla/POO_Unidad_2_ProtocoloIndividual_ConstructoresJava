public class Estudiante {
    //Propiedades
    private String nombre;
    private int edad;
    private String curso;

    //Constructor por defecto
    public Estudiante() {
        this.nombre = "Nombre genérico";
        this.edad = 18;
        this.curso = "Sin asignar";
    }

    //Constructor que acepta nombre y edad
    public Estudiante(String nombre, int edad) {
        this(); // Llama al constructor por defecto
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor que acepta todos los parámetros y utiliza this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor con dos parámetros
        this.curso = curso;
    }

    //Metodo para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
    //ToString para Mostrar los datos del Estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }

}

