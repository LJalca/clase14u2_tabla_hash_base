# Práctica Base (Estudiantes): Tabla Hash Básica en Java

**Asignatura:** Estructuras de Datos y Algoritmos (`CDS-0202`) — Sesión 14 (25/11/2026)

## Objetivo
Completar los 5 bloques `TODO` en `TablaHashBasica.java` y `Main.java` apoyándose en los ejemplos explicados en las diapositivas 12–16 de la clase:

1. `TODO 1`: Implementar `calcularIndice(String clave)` mediante suma de códigos de caracteres y módulo `% capacidad`.
2. `TODO 2`: Implementar `insertar(String clave, String valor)` guardando el par clave-valor en `tabla[indice]`.
3. `TODO 3`: Implementar `buscar(String clave)` con acceso directo `O(1)`.
4. `TODO 4`: Implementar `eliminar(String clave)` liberando la cubeta correspondiente.
5. `TODO 5`: Agregar sus propios casos de prueba en `Main.java`.

## Compilación y Ejecución

```bash
javac EntradaHash.java TablaHashBasica.java Main.java
java Main
```
