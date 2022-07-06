package tqiDioBanco;

public class Main {

    public static void main(String[] args) {

        Cliente sergior = new Cliente();
        sergior.setNome("Sérgio Rodrigues");

        Conta cc = new ContaCorrente(sergior);
        cc.depositar(500);

        Conta poupanca = new ContaPoupanca(sergior);
        poupanca.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
