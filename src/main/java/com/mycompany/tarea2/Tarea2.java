package com.mycompany.tarea2;

import java.util.Scanner;

public class Tarea2 {
    /*
     * Programa para práctica de versionamiento y Java
     * (lectura de datos, validación y arreglos)
     */
    public static void main(String[] args) {
        // Declaración e inicialización de 4 datos primitivos
        int limiteElementos = 5;
        double promedioGeneral = 0.0;
        char identificador = 'A';
        boolean esProgramaActivo = true;

        System.out.println("=== PROGRAMA DE CONSOLA INICIADO ===");
        //llamamos al arreglo 
        Scanner sc = new Scanner(System.in);
        int[] datos1D = new int[limiteElementos];

        System.out.println("\n--- INGRESO DE DATOS 1D ---");
        for (int i = 0; i < datos1D.length; i++) {
            datos1D[i] = leerEnteroValido(sc, "Ingrese valor " + (i + 1), 1, 100);
        }
        procesarArreglo1D(datos1D);
        
        System.out.println("\n--- INGRESO DE DATOS MATRIZ 2D (2x3) ---");
        int[][] matriz2D = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2D[i][j] = leerEnteroValido(sc, "Matriz [" + i + "][" + j + "]", 1, 100);
            }
        }
        procesarMatriz2D(matriz2D);
    
        finalizarPrograma();
    }
    

// Método 1: Leer y validar un número dentro de un rango
    public static int leerEnteroValido(Scanner scanner, String mensaje, int min, int max) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje + " (" + min + " a " + max + "): ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= min && numero <= max) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // Limpiar el buffer de entrada incorrecta
            }
        }
        return numero;
    }

// Método 2: Procesar arreglo unidimensional
    public static void procesarArreglo1D(int[] arreglo) {
        int max = arreglo[0];
        int min = arreglo[0];
        int suma = 0;

        for (int num : arreglo) {
            if (num > max) max = num;
            if (num < min) min = num;
            suma += num;
        }

        double promedio = (double) suma / arreglo.length;

        System.out.println("\n--- RESULTADOS ARREGLO 1D ---");
        System.out.println("Valor Máximo: " + max);
        System.out.println("Valor Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }
// Método 3: Procesar y mostrar matriz bidimensional
    public static void procesarMatriz2D(int[][] matriz) {
        int sumaTotal = 0;

        System.out.println("\n--- CONTENIDO DE LA MATRIZ (2D) ---");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
            System.out.println("| Suma Fila " + (i + 1) + ": " + sumaFila);
        }
        System.out.println("Suma total de la matriz: " + sumaTotal);
    }
    

// Método 4: Mostrar mensaje de finalización
    public static void finalizarPrograma() {
        System.out.println("\n========================================");
        System.out.println("   Programa finalizado exitosamente.   ");
        System.out.println("========================================");
    }
}