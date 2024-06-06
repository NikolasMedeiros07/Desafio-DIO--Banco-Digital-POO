public class BancoDigital {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345");
        ContaPoupanca contaPoupanca = new ContaPoupanca("54321");

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);

        contaCorrente.transferir(contaPoupanca, 200.0);

        System.out.println("Saldo da conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: R$" + contaPoupanca.getSaldo());
    }
}
