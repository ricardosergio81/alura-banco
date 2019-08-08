public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("11111111111", "Ricardo");

        Conta contaComum = new ContaComum(11, 12, cliente);
        contaComum.depositar(100.0);


        Cliente cliente2 = new Cliente("11111111112", "Ricardo2");
        Conta contaComum2 = new ContaComum(11, 13, cliente2);
        contaComum2.depositar(100.0);

        contaComum.transferir(10.0,contaComum2);

        System.out.println(contaComum.getSaldo());
        System.out.println(contaComum2.getSaldo());
    }
}
