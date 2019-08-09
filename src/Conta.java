public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero, Cliente titular) {
        if (agencia <= 0) {
            throw new IllegalArgumentException("Código da Agencia inválida.");
        }

        if (numero <= 0) {
            throw new IllegalArgumentException("Número da conta inválida.");
        }
        Conta.total++;

        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new ContaException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
