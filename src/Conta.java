public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
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
}
