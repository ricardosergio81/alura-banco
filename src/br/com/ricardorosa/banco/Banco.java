package br.com.ricardorosa.banco;

public abstract class Banco {

    private static double valores = 0;

    static void cobrancaServicos(double valor) {
        Banco.valores += valor;

    }

    public static double getCobrancaServicos() {
        return valores;
    }
}
