package br.com.ricardorosa.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TesteProperties {

    public static void main(String[] args) throws Exception {

        //teste  gravação
        Properties properties = new Properties();
        properties.setProperty("login", "alura");
        properties.setProperty("senha", "alurapass");
        properties.setProperty("endereco", "www.alura.com.br");
        properties.store(new FileWriter("conf.properties"), "teste comentário");

        //teste carregamento
        Properties propertiesRead = new Properties();
        propertiesRead.load(new FileReader("conf.properties"));

        String login = propertiesRead.getProperty("login");
        String senha = propertiesRead.getProperty("senha");
        String endereco = propertiesRead.getProperty("endereco");

        System.out.println(login + ", " + senha + ", " + endereco);

    }

}
