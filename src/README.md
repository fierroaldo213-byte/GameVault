# GameVault 🕹️

Sistema de consola en Java para administrar tu colección de videojuegos usando una lista ligada implementada desde cero.

## Descripción

GameVault permite guardar, consultar, editar y eliminar videojuegos desde la consola. Cada videojuego se almacena como un objeto de la clase `Videojuego` dentro de una lista ligada propia (clases `Nodo` y `ListaLigada`), sin usar `ArrayList` ni `LinkedList`.

- **Problema que resuelve:** llevar el control de los juegos que tienes, cuántas horas has jugado, qué calificación les diste y cuáles ya completaste.
- **Objetivo:** aplicar listas ligadas y Programación Orientada a Objetos en Java (Proyecto del 2do Parcial).

## Tecnologías Utilizadas

- Java (JDK 14 o superior)
- Programación Orientada a Objetos
- Lista ligada simple (implementación propia)

## Requisitos Previos

- JDK 14 o superior instalado
- Terminal o consola (o un IDE como IntelliJ, Eclipse o VS Code)

## Instalación

1. Clona este repositorio:

   - git clone https://github.com/tu-usuario/GameVault.git

2. Navega a la carpeta del proyecto:

   - cd GameVault

3. Compila el proyecto:

   - javac -d out src/*.java

## Uso

1. Ejecuta el programa:

   - java -cp out Main

2. Elige una opción del menú escribiendo su número:

```
=== GAMEVAULT ===
1. Agregar videojuego
2. Eliminar videojuego
3. Mostrar colección
4. Buscar videojuego
5. Editar videojuego
6. Ver estadísticas
0. Salir
```

## Características

- Agregar videojuegos al inicio o al final de la lista
- Eliminar un videojuego por título
- Mostrar toda la colección
- Buscar un videojuego por título
- Editar horas jugadas, calificación y estado de completado
- Estadísticas: total de juegos, horas totales, calificación promedio y juegos completados
- Validación de datos ingresados por el usuario

## Estructura del Proyecto

| Archivo | Descripción |
|---|---|
| `Videojuego.java` | Clase que representa un videojuego |
| `Nodo.java` | Nodo de la lista ligada |
| `ListaLigada.java` | Lista ligada con sus operaciones |
| `Main.java` | Menú interactivo por consola |

## Autores

**Aldo Yael Fierro Rivero**

- Email: fierroaldo213@gmail.com
- ID: 20149464
