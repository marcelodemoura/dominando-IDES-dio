package desafio.banco;

public class ContaTeste {
    public static void main(String[] args) {
        Cliente Marcelo = new Cliente();
        Marcelo.setNome("Marcelo");

    Conta cc = new ContaCorrente(Marcelo);
    cc.deposito(100);

    ContaPoupanca cp = new ContaPoupanca(Marcelo);
    cc.transferencia(10,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
