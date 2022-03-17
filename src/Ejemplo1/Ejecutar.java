package Ejemplo1;

import java.util.Scanner;

public class Ejecutar {
    //autora: Estefany Castro
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Alumnos al = new Alumnos();
        double prom;
        String cond;
        System.out.println("Ingrese codigo");
        al.codigo = s.nextInt();
        System.out.println("Ingrese apellidos");
        al.apellidos = s.next();
        System.out.println("Ingrese nombres");
        al.nombres = s.next();
        System.out.println("Ingrese curso");
        al.curso = s.next();
        System.out.println("Ingrese nota 1");
        al.nota1 = s.nextDouble();
        System.out.println("Ingrese nota 2");
        al.nota2 = s.nextDouble();
        al.imprimir();
        prom = al.promedio();
        cond = al.condicion();
        System.out.println("Promedio: " + prom);
        System.out.println("Condicion: " + cond);
    }
}


