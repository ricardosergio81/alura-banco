package br.com.ricardorosa.banco;

public class SeguroVida implements Tributavel {
    @Override
    public double getValorImposto() {
        double valor = 10;
        Banco.cobrancaServicos(valor);
        return valor;
    }
}
