package Ejercicio2;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        Triangulo t = new Triangulo();
        System.out.println("Ingrese la base: ");
        t.base = s.nextDouble();
        System.out.println("Ingrese la altura: ");
        t.altura = s.nextDouble();
        t.imprimir();
    }
}
