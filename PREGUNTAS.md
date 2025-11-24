## Preguntas de la Práctica 5

### 1. Biblioteca y sala

La sala depende totalmente de la biblioteca que la crea; sin ella, no tendría sentido por sí sola.

### 2. ¿Qué pasa si desaparece la biblioteca?

Las salas se pierden también porque forman parte de ella.

### 3. Agregación vs composición

La composición es como “parte del cuerpo” (sala): nace y muere con la biblioteca. La agregación es más suelta (libro): la biblioteca lo usa, pero el libro puede seguir existiendo fuera.

### 4. Herencia de libros

Los dos tipos comparten lo básico de un libro, así que heredar de `Libro` evita repetir código y solo añadimos lo especial de cada uno.

### 5. Herencia en personas

`Usuario` y `Empleado` reaprovechan los datos comunes de `Persona` y se les suma lo particular de cada tipo.

### 6. Uso de `@Override`

Se usa al reescribir métodos de la clase padre como `mostrarInformacion()` o `toString()` en cada subclase para dar su versión específica.
