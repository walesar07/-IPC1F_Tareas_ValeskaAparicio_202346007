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
}