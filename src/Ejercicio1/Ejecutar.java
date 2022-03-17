package Ejercicio1;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        Hipotenusa h = new Hipotenusa();
        System.out.println("Ingrese lado a: ");
        h.a = s.nextDouble();
        System.out.println("Ingrese lado b: ");
        h.b = s.nextDouble();
        h.imprimir();

    }
}

