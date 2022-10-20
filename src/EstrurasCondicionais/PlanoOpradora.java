package EstrurasCondicionais;

public class PlanoOpradora {

    public static void main(String[] args) {

      String plano = "T";

    /*
        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagran gratis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagran gratis");
            System.out.println("5Gb Youtube");
        }
        else {
            System.out.println("plano nao definido");

    }

 */
    switch (plano) {
        case "T": {
            System.out.println("5Gb Youtube");
        }
        case "M": {
            System.out.println("Whats e Instagran gratis");
        }
        case "B": {
            System.out.println("100 minutos de ligação");
        }
    }

    }
}
