public class ContaComum extends Conta {

    public ContaComum(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    public boolean transferir(double valor, Conta destino){
        double novoValor = valor + 0.20;
        if (super.sacar(novoValor)) {
            destino.depositar(valor);
            return true;
        }

        return  false;
    }
}
