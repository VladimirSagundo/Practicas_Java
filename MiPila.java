import java.util.Arrays;
import java.util.Scanner;

public class MiPila {
    private char[] arreglo;
    private int capacidad;
    private int tamaño;

    public MiPila(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new char[capacidad];
        this.tamaño = 0;
    }
    public void push(char elemento) {
        if (tamaño == capacidad) {
            System.out.println("La pila está llena. No se puede agregar más elementos.");
        } else {
            arreglo[tamaño] = elemento;
            tamaño++;
        }
    }
    public void pop() {
        if (tamaño == 0) {
            System.out.println("La pila está vacía. No se puede sacar ningún elemento.");
        } else {
            char elementoEliminado = arreglo[tamaño - 1];
            tamaño--;
            System.out.println("Se eliminó el elemento: " + elementoEliminado);
        }
    }
    public boolean estarVacia() {
        return tamaño == 0;
    }
    public boolean estarLlena() {
        return tamaño == capacidad;
    }
    public void vaciarPila() {
        tamaño = 0;
        Arrays.fill(arreglo, '\0'); 
        System.out.println("Vaciando la Pila...");
    }
    public int size() {
        return tamaño;
    }
    public void mostrarPila() {
        if (estarVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Datos en la Pila: ");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MiPila pila = new MiPila(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 caracteres para la pila:");

        for (int i = 0; i < 5; i++) {
            char caracter = scanner.next().charAt(0);
            pila.push(caracter);
        }
        pila.mostrarPila();
        pila.pop();
        pila.pop();
        pila.mostrarPila();
        System.out.println("Estado Pila vacía: " + pila.estarVacia());
        pila.vaciarPila();
        System.out.println("Estado Pila vacía: " + pila.estarVacia());
    }
}