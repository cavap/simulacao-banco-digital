public abstract class Conta implements IConta{

    private static final int ID_AGENCIA = 1;
    private static int ID_CONTA_AUTO_INCREMENTO = 0;

    protected int idAgencia;
    protected int idConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.idAgencia = ID_AGENCIA;
        this.idConta = ++ID_CONTA_AUTO_INCREMENTO;
        this.saldo = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(double valor, IConta conta) {
        if(this.sacar(valor) && conta.depositar(valor)){
            return true;
        }
        return false;
    }

    @Override
    public String getInformacoes() {
        return "Cliente: " + this.cliente.getNome() + ", Conta: " + this.idConta + ", Saldo: " + this.saldo;
    }
}
