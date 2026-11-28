# Guía de Resolución de Problemas y Ejercicios (TA 1.0h): Tablas Hash (Parte I)

**Institución:** Escuela Superior Politécnica Agropecuaria de Manabí Manuel Félix López (ESPAM MFL)  
**Carrera:** Desarrollo de Software (Modalidad en Línea)  
**Asignatura:** Estructuras de Datos y Algoritmos (`CDS-0202`) — Sesión 14 (`25/11/2026`)  
**Docente:** Ing. Luiggi Alexander Jalca Saltos

---

## Parte A: Ejercicios de Trazado Manual (`h(k) = k % m`)

Resuelve los siguientes ejercicios aplicando la función de dispersión por división vista en clase:

1. **Tabla de capacidad `m = 7`:** Calcula el índice `h(k) = k % 7` para las claves enteras `15`, `22`, `30`, `41` y `50`.
   - Indica en qué cubeta queda cada clave.
   - Identifica si existe algún par de claves que genere colisión y explica por qué ocurrió.
2. **Cambio de capacidad (`m = 11`):** Repite el cálculo `h(k) = k % 11` para las mismas 5 claves (`15, 22, 30, 41, 50`) y responde: ¿mejoró la distribución?
3. **Función Hash para texto (`String`):** Usando los códigos ASCII (`A=65`, `B=66`, `C=67`, `0=48`, `1=49`, `2=50`), calcula manualmente la suma de caracteres y el índice módulo `7` para `"A1"` y `"B0"`. ¿Por qué ambas producen el mismo índice?
4. **Comparación de eficiencia:** Si el sistema académico de la ESPAM almacena `10,000` registros de estudiantes, explica en máximo 4 líneas cuántas comparaciones aproximadas requeriría buscar una cédula usando:
   - Lista Enlazada (`O(n)`)
   - BST Balanceado (`O(log n)`)
   - Tabla Hash bien distribuida (`O(1)`)

---

## Parte B: Resolución de Ejercicios en Java (`clase14u2_tabla_hash_base/`)

Abre el proyecto base [clase14u2_tabla_hash_base/](file:///c:/Users/LAJS/Documents/Deberes/ESPAM/JornadaDeActualizacion/web/eda/clase14u2/clase14u2_tabla_hash_base/README.md) y completa los 5 `TODO` apoyándote en las diapositivas 12–16 de la clase:

- **`TODO 1` (`calcularIndice`):** Suma los caracteres con `clave.charAt(i)` y aplica `Math.abs(suma) % capacidad`.
- **`TODO 2` (`insertar`):** Calcula el índice, reporta si existe colisión con otra clave y guarda `new EntradaHash(clave, valor)` en `tabla[indice]`.
- **`TODO 3` (`buscar`):** Accede directo a `tabla[indice]`, verifica que no sea `null` y que `clave.equals(clave)`.
- **`TODO 4` (`eliminar`):** Libera la cubeta asignando `null` cuando la clave coincide.
- **`TODO 5` (`Main.java`):** Inserta 3 claves propias, muestra la tabla, busca una clave existente, busca una inexistente y elimina un registro.
