package model;

public class MatrizNumerica {

    private int[][] matriz; // Declaro
    private int cantFilas; // Declaro
    private int cantColumnas; // Declaro

    public MatrizNumerica(int filas, int columnas){
        this.cantFilas = filas;
        this.cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializado

    }

    public void instertarValor(int i, int j, int valor){
        matriz[i][j] = valor;
    }

    public int[][] getMatriz() {
        return matriz;
    }
    
    public MatrizNumerica sumar(MatrizNumerica otra) {
        MatrizNumerica resultado = new MatrizNumerica(cantFilas, cantColumnas);
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                resultado.instertarValor(i, j, this.matriz[i][j] + otra.getMatriz()[i][j]);
            }
        }
        return resultado;
    }
}
