package br.com.ricardorosa.comparator;

import br.com.ricardorosa.banco.Conta;

import java.util.Comparator;

public class TitularDaContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
    }
}
