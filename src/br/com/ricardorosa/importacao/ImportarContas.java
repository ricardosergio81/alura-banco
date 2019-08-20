package br.com.ricardorosa.importacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ImportarContas {

    private String fileName;

    public ImportarContas(String fileName) {
        this.fileName = fileName;
    }

    public void importar() throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File(this.fileName));

        while (scanFile.hasNextLine()) {

            String linha = scanFile.nextLine();

            Scanner linhaScan = new Scanner(linha);
            linhaScan.useLocale(Locale.US);
            linhaScan.useDelimiter(",");

            String tipoConta = linhaScan.next();
            int agencia = linhaScan.nextInt();
            int numero = linhaScan.nextInt();
            String titular = linhaScan.next();
            double saldo = linhaScan.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%2s - %04d-%08d, %20s: %08.2f%n",
                    tipoConta, agencia, numero, titular, saldo);


        }
        scanFile.close();
    }
}
