package Ejercicio2;

public class Triangulo {
    double base, altura;

    double area() {
        double a = (base * altura) / 2;
        return a;
    }

    void imprimir() {
        System.out.println("El area del triangulo es: " + area());
    }
}
