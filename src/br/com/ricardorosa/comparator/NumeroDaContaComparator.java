package br.com.ricardorosa.comparator;

import br.com.ricardorosa.banco.Conta;
import java.util.Comparator;

public class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(),c2.getNumero());
    }
}
