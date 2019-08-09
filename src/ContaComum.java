public class ContaComum extends Conta {

    private static int total = 0;
    public ContaComum(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
        ContaComum.total++;
    }

    public void transferir(double valor, Conta destino){
        double novoValor = valor + 0.20;
        super.sacar(novoValor);
            destino.depositar(valor);

    }
    public static int getTotal() {
        return total;
    }
}
