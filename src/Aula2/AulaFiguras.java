package Aula2;

public class AulaFiguras {

        public static void quadrado(double area){

            System.out.println("A area do quadrado é:" + area * area);
        }

        public static void retangulo(double area1, double area2){

            System.out.println("A area do Retangulo é:" + area1 * area2);
        }

        public static void trapezio(double base1, double base2, double altura){

            System.out.println("A area do Trapezio é:" + ((base1 + base2) * altura)/ 2);
        }
}
