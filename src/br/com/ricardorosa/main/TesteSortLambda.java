package br.com.ricardorosa.main;

import br.com.ricardorosa.banco.Cliente;
import br.com.ricardorosa.banco.Conta;
import br.com.ricardorosa.banco.ContaPoupanca;
import br.com.ricardorosa.comparator.NumeroDaContaComparator;
import br.com.ricardorosa.comparator.TitularDaContaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteSortLambda {

    public static void main(String[] args) {

        Conta cc1 = new ContaPoupanca(123, 12, new Cliente("11111111112", "Ricardo"));
        cc1.depositar(100.0);

        Conta cc2 = new ContaPoupanca(123, 13, new Cliente("11111111112", "Maria"));
        cc2.depositar(400.0);

        Conta cc3 = new ContaPoupanca(123, 16, new Cliente("11111111112", "Jose"));
        cc3.depositar(500.0);

        Conta cc4 = new ContaPoupanca(123, 11, new Cliente("11111111112", "Ana"));
        cc4.depositar(101.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome() + ", " + conta.getSaldo()));

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        System.out.println("-------------------------");

        lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome() + ", " + conta.getSaldo()));

        lista.sort((c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome()));

    }
}
