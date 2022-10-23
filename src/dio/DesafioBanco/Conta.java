package dio.DesafioBanco;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;
    protected int agencia,numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        agencia = AGENCIA_PADRAO;
        numero = sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (saldo>=valor) {
            saldo -= valor;
        }else
            System.out.println("Saldo insuficiente!");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo>=valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else
            System.out.println("Saldo insuficiente!");
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
