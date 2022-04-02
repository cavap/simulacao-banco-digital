public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes de Conta Poupanca: " + super.getInformacoes());
    }
}
