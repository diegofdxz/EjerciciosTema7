# EjerciciosTema7
# Mi repositorio es https://github.com/diegofdxz/EjerciciosTema7.git

## 1 Los dados
Crea una clase modelizando un dado para jugar. Esta clase tiene:

dos atributos de instancia: uno que permite conocer el número de caras que tiene el dado y otro para almacenar la última cara que se extrajo;

dos constructores: uno que recibe como argumento el número de caras para el dado a crear y el otro, sin argumentos, que crea un clásico dado de seis caras; 

métodos getter para los dos atributos;

un método setter, solo para cambiar el número de caras;

un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.

Escribir un algoritmo principal usando esta clase para crear tres dados: uno tiene seis caras, otro tiene diez caras y el último tiene doce caras. Los tres dados se lanzan hasta que la suma de los dados sea mayor o igual a veinte.

## 2 Los clientes
Para las necesidades de un sitio de venta online de libros de informática, ediciones ENI por ejemplo, se pide crear una clase que permita modelizar a un cliente. Todos los clientes tienen un nombre y se les debe asignar un número de cliente. También se pide escribir un algoritmo de prueba para capturar y mostrar clientes.

Ejemplo de ejecución posible:

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

2

¿Nombre?

Francisco GONZALEZ

Cliente n.°1 [Francisco GONZALEZ] añadido

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

2

¿Nombre?

Carlota OLIVERA

Cliente n.°2 [Carlota OLIVERA] añadido

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

1

-- Clientes --

Cliente n.°1 [Francisco GONZALEZ]

Cliente n.°2 [Carlota OLIVERA]

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

3

## 3 Micro guerra de barcos (versión 3)
En esta nueva versión de la micro guerra de barcos (un único barco de una sola celda), se usa el paradigma de programación orientada a objetos.

Cree una clase Cuadricula que tenga:

un atributo de instancia de tipo tabla de 10 × 10 casillas;

las constantes que estime necesarias;

un constructor sin argumentos, que permite inicializar el tablero del juego con agua por todas partes;

un método de instancia depositarBarco(), que toma como argumentos las coordenadas de la caja donde colocar el barco;

un método de instancia disparar(), que recibe como argumentos las coordenadas de disparo y devuelve verdadero si se ha hundido el barco;

un método de instancia visualizacion(), que muestra el tablero de juego de la guerra de barcos.

Escribe un algoritmo usando la clase Cuadricula, que permite a un jugador jugar a la micro guerra de barcos.

## 4 Micro guerra de barcos (versión 4)
Requisitos previos: Ejercicio 3 de este capítulo

En esta última versión de la micro guerra de barcos, el usuario juega contra la computadora. Los dos jugadores tienen cada uno una cuadrícula de barcos de guerra y esconden el barco. El jugador humano elige la posición del barco. La computadora genera coordenadas al azar para posicionar su barco. Los jugadores disparan por turnos.

La computadora dispara sucesivamente en cada celda.
