# 🕹️ GameVault

Proyecto del segundo parcial.

GameVault es un programa en Java que se usa desde la consola y sirve para guardar y administrar tu colección de videojuegos. La idea es tener todos tus juegos en un solo lugar y poder ver cuántas horas llevas jugadas, qué calificación le diste a cada uno y cuáles ya terminaste.

Los juegos se guardan en una lista ligada que hice yo con mis propias clases (`Nodo` y `ListaLigada`). Cada videojuego es un objeto de la clase `Videojuego`, y cada nodo de la lista guarda uno de esos objetos y apunta al siguiente.

## Qué se guarda de cada juego

De cada videojuego se guarda el título, la plataforma (PC, PS5, Switch, etc.), el género, las horas jugadas, la calificación del 0 al 10 y si ya lo terminaste o no.

## Qué puedes hacer

- **Agregar** un videojuego, ya sea al inicio o al final de la lista.
- **Eliminar** un videojuego escribiendo su título.
- **Ver** todos los videojuegos que tienes guardados.
- **Buscar** un videojuego por su título.
- **Editar** un videojuego para cambiar sus horas, su calificación o si ya lo completaste.
- **Ver estadísticas**: cuántos juegos tienes, el total de horas jugadas, el promedio de tus calificaciones y cuántos juegos has completado.

## Cómo está organizado

- `Main`: es el menú, donde se piden los datos por consola y se elige qué hacer.
- `Nodo`: guarda un videojuego y apunta al siguiente nodo de la lista.
- `ListaLigada`: tiene todo lo que se puede hacer con la lista (agregar, eliminar, buscar, mostrar y las estadísticas).
- `Videojuego`: tiene los datos de cada juego.

## Cómo correrlo

1. Descarga el proyecto y ábrelo en tu editor de Java (NetBeans, Eclipse, IntelliJ, VS Code...).
2. Abre el archivo `Main.java`, que está en la carpeta `src`.
3. Dale al botón de **Run** (o ejecutar).
4. En la consola te va a salir un menú. Escribe el número de lo que quieras hacer y dale Enter.

Si lo quieres correr desde la terminal, entra a la carpeta del proyecto y escribe estos dos comandos:

```
javac -d out src/*.java
java -cp out Main
```

Necesitas tener Java instalado (versión 14 o más nueva).

## Autor

Aldo Yael Fierro Rivero
ID: 20149464
fierroaldo213@gmail.com
