public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes de Conta Corrente: " + super.getInformacoes());
    }
}
