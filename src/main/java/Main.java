
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        System.out.println("Hola mundo desde Java");

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

       
        int resultado = num1 * num2;

        
        System.out.println("La multiplicación es: " + resultado);

        sc.close();
        
     // Forma 1: declaración y creación con tamaño definido
     // En esta forma se declara el arreglo y luego se indica la cantidad de elementos que almacenará.
        int[] numeros1;
        numeros1 = new int[3];
        numeros1[0] = 5;
        numeros1[1] = 10;
        numeros1[2] = 15;

        // Forma 2: declaración e inicialización directa
        // En esta forma se declara el arreglo y se asignan los valores en una sola instrucción.
        int[] numeros2 = {5, 10, 15};

        
        System.out.println(numeros1[0]);
        System.out.println(numeros2[1]);
        
     // Arreglo base
        int[] numeros = {5, 2, 9, 1, 3};

        // 1. Arrays.sort()
        // Ordena los elementos de un arreglo en orden ascendente.
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // 2. Arrays.binarySearch()
        // Busca un elemento dentro de un arreglo ordenado y devuelve su índice.
        // Si el elemento no existe, devuelve un valor negativo.
        int posicion = Arrays.binarySearch(numeros, 3);
        System.out.println("Posición del número 3: " + posicion);

        // 3. Arrays.copyOf()
        // Crea una copia de un arreglo con un tamaño específico.
        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println("Copia del arreglo: " + Arrays.toString(copia));

        // 4. Arrays.fill()
        // Asigna el mismo valor a todas las posiciones de un arreglo.
        int[] relleno = new int[4];
        Arrays.fill(relleno, 8);
        System.out.println("Arreglo rellenado: " + Arrays.toString(relleno));

        // 5. Arrays.equals()
        // Compara dos arreglos y devuelve true si tienen el mismo contenido y orden.
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {1, 2, 3};
        System.out.println("¿Son iguales?: " + Arrays.equals(arreglo1, arreglo2));

        // 6. Arrays.toString()
        // Convierte un arreglo en una cadena legible.
        System.out.println("Arreglo como texto: " + Arrays.toString(arreglo1));

        // 7. Arrays.stream()
        // Convierte un arreglo en un stream para realizar operaciones avanzadas.
        int suma = Arrays.stream(numeros).sum();
        System.out.println("Suma de los elementos: " + suma);
    }

}
