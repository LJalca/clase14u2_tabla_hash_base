public class Main {
    public static void main(String[] args) {
        TablaHashBasica directorio = new TablaHashBasica(7);

        directorio.insertar("EST-101", "Laura Gomez");
        directorio.insertar("EST-102", "Diego Paredes");
        directorio.insertar("EST-105", "Sofia Vera");

        directorio.mostrarTabla();

        System.out.println("Buscar EST-102: " + directorio.buscar("EST-102"));
        System.out.println("Buscar EST-999: " + directorio.buscar("EST-999"));
        System.out.println("Eliminar EST-101: " + directorio.eliminar("EST-101"));

        // TODO 5: Insertar 3 claves propias (por ejemplo matriculas o codigos de producto),
        // mostrar la tabla actualizada, buscar 1 clave existente, buscar 1 inexistente
        // y eliminar 1 registro verificando el resultado en consola.
    }
}
