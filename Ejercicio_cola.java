import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio_cola {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int tamaño;
        String cadena;
        String datoSacado;
        String respuesta;

        System.out.print("Ingresa el tamaño del arreglo: ");
        tamaño= leer.nextInt();
        leer.nextLine();

        Queue<String> Colaa= new LinkedList<>();

        for (int i= 0; i < tamaño; i++) {
            System.out.print("Ingrese una palabra para el elemento " + i + ": ");
            cadena= leer.nextLine();
            Colaa.add("-"+cadena+"-");
        }

        cola(Colaa);

        System.out.print("Desea sacar un dato de la cola? (s/n): ");
        respuesta= leer.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            datoSacado=Colaa.poll();
            System.out.println("Dato sacado de la cola: " + "-" + datoSacado + "-");

            cola(Colaa);
        } else {
            System.out.println("No se ha sacado ningún dato de la cola.");
        }



        leer.close();
    }

    public static void cola(Queue<String> cola) {
        System.out.println("Contenido de la cola :");
        for (String elemento : cola) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}