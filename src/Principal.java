public class Principal {

    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("11111111111", "Ricardo");
            Conta contaCliente1 = new ContaComum(11, 12, cliente);
            contaCliente1.depositar(100.0);

            Cliente cliente2 = new Cliente("11111111112", "Ricardo2");
            Conta contaCliente2 = new ContaPoupanca(11, 13, cliente2);
            contaCliente2.depositar(100.0);

            contaCliente1.transferir(1000.0, contaCliente2);

            Cliente cliente3 = new Cliente("11111111113", "Ricardo3");
            Conta contaCliente3 = new ContaPoupanca(11, 13, cliente3);
            contaCliente2.depositar(100.0);

            System.out.println("Saldo na conta do "+contaCliente1.getTitular().getNome()+" - "+contaCliente1.getSaldo());
            System.out.println("Saldo na conta do "+contaCliente2.getTitular().getNome()+" - "+contaCliente2.getSaldo());
            System.out.println("Saldo na conta do "+contaCliente3.getTitular().getNome()+" - "+contaCliente3.getSaldo());

        } catch (Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
        } finally {
            System.out.println("--------------------------------------"
                    + "\nTotal de clientes: " + Cliente.getTotal()
                    + "\nTotal de contas poupanca: " + ContaPoupanca.getTotal()
                    + "\nTotal contas Comum: " + ContaComum.getTotal()
                    + "\nTotal Geral: " + Conta.getTotal());

        }
    }
}
