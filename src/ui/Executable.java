package ui;

import model.Controller;
import model.MatrizNumerica;

import java.util.Scanner;

public class Executable {

    private Scanner escaner;
    private Controller cont;

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        cont = new Controller();
        escaner = new Scanner(System.in);

    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {

        System.out.println("Ingrese la cantidad de filas:");
        int filas = escaner.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        int columnas = escaner.nextInt();
        escaner.nextLine();

        cont.crearMatrices(filas, columnas);

        System.out.println("Inserte los numeros de la matriz numero 1");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Insertar dato en fila " + i +" y columna " + j + " : ");
                int valor = escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz1().instertarValor(i, j, valor);
            }
        }

        System.out.println("Inserte los numeros de la matriz numero 2");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Insertar dato en fila " + i + ", columna " + j + ": ");
                int valor = escaner.nextInt();
                escaner.nextLine();
                cont.getMatriz2().instertarValor(i, j, valor);
            }
        }

        System.out.println("\nMatriz 1:");
        imprimirMatriz(cont.getMatriz1());

        System.out.println("\nMatriz 2:");
        imprimirMatriz(cont.getMatriz2());

        MatrizNumerica suma = cont.sumarMatrices();
        System.out.println("\nSuma de matrices:");
        imprimirMatriz(suma);
    }

    private void imprimirMatriz(MatrizNumerica matriz) {
        int[][] datos = matriz.getMatriz();
        for (int[] fila : datos) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}