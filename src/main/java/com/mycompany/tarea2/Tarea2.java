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
}