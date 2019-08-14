package br.com.ricardorosa.main;

import br.com.ricardorosa.banco.*;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> contaArrayList = new ArrayList();

        contaArrayList.add(new ContaComum(123, 12, new Cliente("11111111111", "Ricardo1")));

        Cliente cliente2 = new Cliente("11111111112", "Ricardo2");
        Conta conta2 = new ContaPoupanca(123, 12, cliente2);
        contaArrayList.add(conta2);

        contaArrayList.add(new ContaComum(123, 13, new Cliente("11111111113", "Ricardo3")));

        for (Conta conta : contaArrayList) {
            System.out.println(conta);
        }
        System.out.println(contaArrayList.size());
        contaArrayList.remove(1);// TODO como remover um elemento da lista e retirar do contador
        System.out.println(contaArrayList.size());

        System.out.println("--------------------------------------"
                + "\nTotal de clientes: " + Cliente.getTotal()
                + "\nTotal de contas poupanca: " + ContaPoupanca.getTotal()
                + "\nTotal contas Comum: " + ContaComum.getTotal()
                + "\nTotal Geral: " + Conta.getTotal()
                + "\nTotal Cobranças Serviçoes: " + Banco.getCobrancaServicos());

    }
}
