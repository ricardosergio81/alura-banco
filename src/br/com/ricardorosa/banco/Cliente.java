package br.com.ricardorosa.banco;

public class Cliente {

    private String nome;
    private String cpf;
    private static int total = 0;

    public Cliente(String cpf, String nome) {
        Cliente.total ++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public static int getTotal() {
        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
