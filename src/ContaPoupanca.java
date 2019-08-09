public class ContaPoupanca extends  Conta{

    private static int total = 0;
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
        ContaPoupanca.total++;
    }

    public static int getTotal() {
        return total;
    }
}
