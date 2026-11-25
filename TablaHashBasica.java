public class TablaHashBasica {
    private EntradaHash[] tabla;
    private int capacidad;

    public TablaHashBasica(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new EntradaHash[capacidad];
    }

    public int calcularIndice(String clave) {
        // TODO 1: Recorrer cada caracter de 'clave' con un ciclo for,
        // sumar su valor numerico (clave.charAt(i)) y retornar Math.abs(suma) % capacidad.
        // Referencia: Diapositiva 13 (Funcion Hash para claves String).
        return 0;
    }

    public void insertar(String clave, String valor) {
        // TODO 2: Calcular el indice llamando a calcularIndice(clave).
        // Si tabla[indice] ya tiene un dato con otra clave, mostrar un aviso corto de colision.
        // Guardar new EntradaHash(clave, valor) en tabla[indice].
        // Referencia: Diapositiva 14 (Metodo insertar).
    }

    public String buscar(String clave) {
        // TODO 3: Calcular el indice llamando a calcularIndice(clave).
        // Si tabla[indice] != null y tabla[indice].clave.equals(clave), retornar tabla[indice].valor.
        // En caso contrario, retornar null.
        // Referencia: Diapositiva 15 (Metodo buscar en O(1)).
        return null;
    }

    public boolean eliminar(String clave) {
        // TODO 4: Calcular el indice llamando a calcularIndice(clave).
        // Si tabla[indice] != null y tabla[indice].clave.equals(clave),
        // asignar tabla[indice] = null y retornar true. Si no existe, retornar false.
        // Referencia: Diapositiva 16 (Metodo eliminar).
        return false;
    }

    public void mostrarTabla() {
        for (int i = 0; i < capacidad; i++) {
            if (tabla[i] != null) {
                System.out.println("Cubeta [" + i + "] -> " + tabla[i].clave + " : " + tabla[i].valor);
            } else {
                System.out.println("Cubeta [" + i + "] -> vacia");
            }
        }
    }
}
