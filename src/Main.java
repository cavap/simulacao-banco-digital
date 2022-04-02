public class Main {

    public static void main(String[] args) {
	    //usarFuncionalidades();
    }

    private static void usarFuncionalidades() {
        Cliente c1 = new Cliente("a");
        Cliente c2 = new Cliente("b");
        ContaCorrente corrente = new ContaCorrente(c1);
        ContaPoupanca poupanca = new ContaPoupanca(c2);

        poupanca.exibirInformacoes();
        corrente.exibirInformacoes();

        realizarDeposito(1, corrente);
        realizarDeposito(2, poupanca);

        realizarSaque(10, corrente);
        realizarSaque(10, poupanca);

        realizarTransferencia(1, corrente, poupanca);

        poupanca.exibirInformacoes();
        corrente.exibirInformacoes();
    }

    private static void realizarTransferencia(double valor, Conta c1, Conta c2) {
        if(c1.transferir(valor, c2)){
            System.out.println("Transferido " + valor + " da conta: " + c2.idConta + " para a conta: " + c2.idConta);
        } else {
            System.out.println("Falha ao transferir " + valor + " da conta: " + c2.idConta + " para a conta: " + c2.idConta);
        }
    }

    private static void realizarSaque(double valor, Conta conta) {
        if(conta.sacar(valor)){
            System.out.println(valor + "sacado da conta: " + conta.idConta);
        } else {
            System.out.println("Falha ao sacar " + valor + " da conta: " + conta.idConta);
        }
    }

    private static void realizarDeposito(double valor, Conta conta) {
        if(conta.depositar(valor)){
            System.out.println(valor + " depositado na conta: " + conta.idConta);
        } else {
            System.out.println("Falha ao depoistar " + valor + " na conta: " + conta.idConta);
        }
    }
}
