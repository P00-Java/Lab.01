package Ejemplo3;

public class Circulo {

    double radio;

    double area() {
        double a = Math.PI * Math.pow(radio, 2);
        return a;
    }

    void imprimir() {
        System.out.println("El area es: " + area());
    }
}
