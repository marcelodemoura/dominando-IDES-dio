package EstrurasCondicionais;

public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota= 6;

       /* if(nota >= 7 ) {
            System.out.println("aprovado");
        }
        else if (nota >=5 && nota <7) {
            System.out.println("Recuperação");

        } else{
            System.out.println("reprovado");
        }*/

        String resultado = nota >= 7? "Aprovado": nota >=5 && nota <7?
                "Recuperação" :   "Reprovado";
        System.out.println(resultado);
    }
}
