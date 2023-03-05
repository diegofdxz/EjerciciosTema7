/*
3. Micro guerra de barcos (versión 3)
En esta nueva versión de la micro guerra de barcos (un único barco de una sola celda), se usa el paradigma de programación orientada a objetos.

Cree una clase Cuadricula que tenga:

un atributo de instancia de tipo tabla de 10 × 10 casillas;

las constantes que estime necesarias;

un constructor sin argumentos, que permite inicializar el tablero del juego con agua por todas partes;

un método de instancia depositarBarco(), que toma como argumentos las coordenadas de la caja donde colocar el barco;

un método de instancia disparar(), que recibe como argumentos las coordenadas de disparo y devuelve verdadero si se ha hundido el barco;

un método de instancia visualizacion(), que muestra el tablero de juego de la guerra de barcos.

Escribe un algoritmo usando la clase Cuadricula, que permite a un jugador jugar a la micro guerra de barcos.
 */

import java.util.Scanner;
public class Ej3 {

    class Cuadricula{
int[][] tablero = new int[10][10];
final int DISPARO = 4;
        final int AGUA = 0;
        final int BARCO = 1;
        final int TOCADO = 2;
        final int HUNDIDO = 3;
        public Cuadricula(){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = AGUA;
                }
            }
        }
        public void depositarBarco(){
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            tablero[x][y] = BARCO;
        }
        public boolean disparar(int x, int y){
            if (tablero[x][y] == BARCO){
                tablero[x][y] = DISPARO;
                tablero[x][y] = TOCADO;
                return true;
            }
            tablero[x][y] = DISPARO;
            return false;
        }
        public void visualizacion(){
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
    public static void Principal(){

        Scanner sc = new Scanner(System.in);
        Ej3 ej3 = new Ej3();
        Ej3.Cuadricula cuadricula = ej3.new Cuadricula();
        cuadricula.depositarBarco();
        cuadricula.visualizacion();

        boolean hundido = false;
        while ((!hundido)){

            System.out.println();
            System.out.println("Introduce las coordenadas X de disparo: (0-9) (-1 para salir)");
            int x = sc.nextInt();
            if (x == -1){
                System.out.println("Saliendo...");
                break;


            }else if (x < 0 || x > 9) {
            System.out.println("Coordenada X incorrecta");
            continue;
        }
            System.out.println("Introduce las coordenadas Y de disparo: (0-9) (-1 para salir)");
            int y = sc.nextInt();
            if (y == -1){
                System.out.println("Saliendo...");
                break;
            }else if (y < 0 || y > 9){
                System.out.println("Coordenada Y incorrecta");
                continue;
            }
            hundido = cuadricula.disparar(x, y);
            cuadricula.visualizacion();
        }
    }
    public static void main(String[] args) {
        Ej3.Principal();
    }
}
