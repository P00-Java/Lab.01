package Ejercicio1;

public class Hipotenusa {
    double a, b;

    double hipotenusa() {
        double h = Math.sqrt(a * a + b * b);
        return h;
    }

    void imprimir() {
        System.out.println("La hipotenusa es: " + hipotenusa());
    }

}
