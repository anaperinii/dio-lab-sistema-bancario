public class Main {
    
    public static void main(String[] args) {

        Cliente anaLuisa = new Cliente();
        anaLuisa.setNome("Ana Luisa");

        Conta corrente = new ContaCorrente(anaLuisa);
        Conta poupanca = new ContaPoupanca(anaLuisa);

        corrente.depositar(400);
        corrente.transferir(126, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
