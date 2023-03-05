/*
Requisitos previos: Ejercicio 3 de este capítulo

En esta última versión de la micro guerra de barcos, el usuario juega contra la computadora. Los dos jugadores tienen cada uno una cuadrícula de barcos de guerra y esconden el barco. El jugador humano elige la posición del barco. La computadora genera coordenadas al azar para posicionar su barco. Los jugadores disparan por turnos.

La computadora dispara sucesivamente en cada celda.
 */
import java.util.Scanner;
public class Ej4 {

    class Cuadricula{
        int[][] tablero = new int[10][10];
        final int DISPARO = 4;
        final int AGUA = 0;
        final int BARCOJUGADOR = 1;
        final int TOCADO = 2;
        final int HUNDIDO = 3;
        public Cuadricula(){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = AGUA;
                }
            }
        }
        public void depositarBarco(int x, int y){
            tablero[x][y] = BARCOJUGADOR;
        }
        public boolean disparar(int x, int y){
            if (tablero[x][y] == BARCOJUGADOR){
                tablero[x][y] = DISPARO;
                tablero[x][y] = TOCADO;
                return true;
            }
            tablero[x][y] = DISPARO;
            return false;
        }
        public void visualizacionJugador(){
            //no se visualizara el barco, solo los impactos
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == TOCADO) {
                        System.out.print("X ");
                    }else if (tablero[i][j] == HUNDIDO){
                        System.out.print("X ");
                    }else if (tablero[i][j] == AGUA){
                        System.out.print("0 ");
                    }else if (tablero[i][j] == DISPARO) {
                        System.out.print("+ ");
                    }else if (tablero[i][j] == BARCOJUGADOR){
                        System.out.print("B ");
                    }else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
        public void visualizacionMaquina(){
            //no se visualizara el barco, solo los impactos
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == TOCADO){
                        System.out.print("X ");
                    }else if (tablero[i][j] == AGUA){
                        System.out.print("0 ");
                    }else if (tablero[i][j] == DISPARO){
                        System.out.print("+ ");
                    }else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void Principal() {
        Scanner sc = new Scanner(System.in);
        Ej4 ej4 = new Ej4();
        Ej4.Cuadricula cuadricula = ej4.new Cuadricula();
        Ej4.Cuadricula cuadricula2 = ej4.new Cuadricula();
        System.out.println("Jugador 1");
        int x = -2;
        while (x < 0 || x > 9){
            System.out.println("Introduce la posicion del barco");
            System.out.print("x: ");
            x = sc.nextInt();
            if (x < 0 || x > 9){
                System.out.println("Coordenada X incorrecta, intentelo otra vez: ");
            }
    }
        int y = -2;
        while (y < 0 || y > 9){
            System.out.println("Introduce la posicion del barco");
            System.out.print("y: ");
            y = sc.nextInt();
            if (y < 0 || y > 9){
                System.out.println("Coordenada Y incorrecta, intentelo otra vez: ");
            }
    }
        cuadricula.depositarBarco(x, y);
        System.out.println("Barco colocado en la posicion: " + x + ", " + y);
        cuadricula.visualizacionJugador();
        System.out.println("Jugador 2");
        System.out.println("Introduce la posicion del barco");


        int x2 = (int) (Math.random() * 10);

        System.out.print("x: xxx\n");

        int y2 = (int) (Math.random() * 10);

        System.out.print("y: yyy\n");

        cuadricula2.depositarBarco(x2, y2);

        while ((cuadricula.tablero[x][y] == 1) || (cuadricula2.tablero[x][y] == 1)) {
            System.out.println("Jugador 1");
            System.out.println("Introduce la posicion del disparo");
            System.out.print("x: \n");
            int x3 = sc.nextInt();
            while ((x3 > 9)||(x3 < 0)) {
                System.out.println("Coordenada X incorrecta, intentelo otra vez: ");
                x3 = sc.nextInt();
            }
            System.out.print("y: \n");
            int y3 = sc.nextInt();
            while ((y3 > 9)||(y3 < 0)) {

                System.out.println("Coordenada Y incorrecta, intentelo otra vez: ");
                y3 = sc.nextInt();
            }
            System.out.println("\nTablero del jugador 2");
            if (cuadricula2.disparar(x3, y3)) {
                cuadricula2.visualizacionMaquina();
                System.out.println("Has tocado el barco");
                System.out.println("Ganador jugador 1");
            System.out.println("---SALIENDO DEL JUEGO---");
                break;
            } else {

                cuadricula2.visualizacionMaquina();
                System.out.println("\nHas fallado\n");
            }
            System.out.println("Jugador 2");
            System.out.println("Introduce la posicion del disparo");
            int x4 = (int) (Math.random() * 10);
            System.out.print("x: "+ x4 +"\n");

            int y4 = (int) (Math.random() * 10);
            System.out.print("y: "+ y4 +"\n");

            System.out.println("\nTablero del jugador 1");
            if (cuadricula.disparar(x4, y4)) {
                cuadricula.visualizacionJugador();
                System.out.println("Has tocado el barco\n");
                System.out.println("Ganador jugador 2\n");
                System.out.println("---SALIENDO DEL JUEGO---");
                break;
            } else {
                cuadricula.visualizacionJugador();
                System.out.println("\nHas fallado\n");
            }


        }
    }
    public static void main(String[] args) {
        Principal();
    }
}
