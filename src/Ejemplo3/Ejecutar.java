package Ejemplo3;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        //Autora: Estefany Castro
        Scanner s = new Scanner(System.in);
        Circulo c = new Circulo();
        System.out.println("Ingrese radio: ");
        c.radio = s.nextDouble();
        c.imprimir();
    }
}
