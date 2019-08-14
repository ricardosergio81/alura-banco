package br.com.ricardorosa.banco;

public class ContaComum extends Conta {

    private static int total = 0;
    public ContaComum(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
        ContaComum.total++;
    }

    public void transferir(double valor, Conta destino){
        double novoValor = valor + 0.2;
        super.sacar(novoValor);
            destino.depositar(valor);
        Banco.cobrancaServicos(0.2);

    }
    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Conta Comum: "+super.toString();
    }
}
