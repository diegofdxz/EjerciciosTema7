/*
Los dados
Crea una clase modelizando un dado para jugar. Esta clase tiene:

dos atributos de instancia: uno que permite conocer el número de caras que tiene el dado y otro para almacenar la última cara que se extrajo;

dos constructores: uno que recibe como argumento el número de caras para el dado a crear y el otro, sin argumentos, que crea un clásico dado de seis caras;

métodos getter para los dos atributos;

un método setter, solo para cambiar el número de caras;

un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.

Escribir un algoritmo principal usando esta clase para crear tres dados: uno tiene seis caras, otro tiene diez caras y el último tiene doce caras. Los tres dados se lanzan hasta que la suma de los dados sea mayor o igual a veinte.
 */
public class Ej1 {
    public static void main(String[] args) {
        Ej1.Principal();
    }
    int numeroDeCaras;
    int ultimaCara;

    public Ej1(int numeroDeCaras) {
        this.numeroDeCaras = numeroDeCaras;
    }

    public Ej1() {
        this.numeroDeCaras = 6;
    }

    public int getNumeroDeCaras() {
        return numeroDeCaras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setNumeroDeCaras(int numeroDeCaras) {
        this.numeroDeCaras = numeroDeCaras;
    }
    public static int tirarDado(int numeroDeCaras){
        return (int) (Math.random() * numeroDeCaras + 1);
    }
    public static void Principal(){
        Ej1 dado1 = new Ej1();
        Ej1 dado2 = new Ej1(10);
        Ej1 dado3 = new Ej1(12);
        int suma = 0;
        while (suma < 20){
            suma = 0;
            suma += tirarDado(dado1.getNumeroDeCaras());
            suma += tirarDado(dado2.getNumeroDeCaras());
            suma += tirarDado(dado3.getNumeroDeCaras());
            System.out.println("La suma de los dados es: " + suma);
        }
    }
}
