package br.com.ricardorosa.main;


import br.com.ricardorosa.importacao.ImportarContas;

public class TesteImportacao {

    public static void main(String[] args) throws Exception {
        ImportarContas importacao = new ImportarContas("contas.csv");
        importacao.importar();
    }
}
