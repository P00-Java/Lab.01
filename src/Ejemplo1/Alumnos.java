package Ejemplo1;

public class Alumnos {
    int codigo;
    String apellidos, nombres, curso;
    double nota1, nota2;

    void imprimir() {
        System.out.println("Codigo: " + codigo);
        System.out.println(nombres + " " + apellidos);
        System.out.println("Curso: " + curso);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
    }

    double promedio() {
        double prom = (nota1 + nota2) / 2;
        return prom;
    }

    String condicion() {
        if (promedio() >= 13) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}

