package Aula3;

public class Fgeo {

    public static void main(String[] args) {

        System.out.println("exercicio Retornos");

        double quadrado = FgeomAula3.quadrado(9);
        System.out.println("Área do quadrado é" + quadrado);

        double retangulo = FgeomAula3.retangulo(9, 6);
        System.out.println("Área do retangulo é" + retangulo);

        double trapezio = FgeomAula3.trapezio(9,9,10);
        System.out.println("Área do trapezio é" + trapezio);
    }
}
