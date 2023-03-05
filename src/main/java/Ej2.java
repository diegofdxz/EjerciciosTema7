/*
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
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) {
        Ej2.Principal();
    }
    class Cliente {
        private String nombre;
        private int numeroDeCliente;
        private static int contador = 0;

        public Cliente(String nombre) {
            this.nombre = nombre;
            this.numeroDeCliente = ++contador;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumeroDeCliente() {
            return numeroDeCliente;
        }
    }

    public void crearCliente(ArrayList<Cliente> clientes){


        System.out.println("¿Nombre?");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(nombre);
        clientes.add(cliente);
        System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "] añadido");

    }

 public void mostrarClientes(ArrayList<Cliente> clientes) {
        System.out.println("-- Clientes --");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente n.°" + cliente.getNumeroDeCliente() + " [" + cliente.getNombre() + "]");
        }
    }
    public static void Principal(){
        Scanner sc = new Scanner(System.in);
        Ej2 ej2 = new Ej2();
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("-- Menú --");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear un cliente");
            System.out.println("3 - Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ej2.mostrarClientes(clientes);
                    break;
                case 2:
                    ej2.crearCliente(clientes);
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
